package org.example.client;

import org.example.services.api.PersonReader;

import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args ) {
        var serviceLoader = ServiceLoader.load(PersonReader.class);
        var reader = serviceLoader.findFirst().get();
        System.out.format("Found %d persons%n", reader.getAll().size());
    }
}
