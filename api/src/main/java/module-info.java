module org.example.api {
    requires org.example.services;
    requires io.javalin;
    requires com.fasterxml.jackson.databind;
    requires org.slf4j.simple;
    requires kotlin.stdlib;

    uses org.example.services.api.PersonReader;
}