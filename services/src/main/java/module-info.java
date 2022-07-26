module org.example.services {
    exports org.example.services.api;
    provides org.example.services.api.PersonReader with org.example.services.inmemory.InMemoryPersonReader;
    requires org.example.models;
}