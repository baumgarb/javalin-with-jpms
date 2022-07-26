package org.example.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.javalin.Javalin;
import org.example.services.api.PersonReader;
import org.example.services.inmemory.InMemoryPersonReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ServiceLoader;

public class WebAPI {
    private static Logger logger = LoggerFactory.getLogger(WebAPI.class);
    private static short port = 7312;

    public static void main(String[] args)  {
        logger.info("Hello World from WebAPI, yay :-)");

        var personSvc = new InMemoryPersonReader();

        var objMapper = new ObjectMapper();
        var result = objMapper.valueToTree(personSvc.getAll());

        var app = Javalin.create().start(port);
        app.get("/ping", ctx -> ctx.result("pong"));
        app.get("/persons", ctx -> ctx.json(result));
    }
}
