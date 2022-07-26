package org.example.models;

public class Person {
    private int id;
    private String name;
    private boolean isLaessig;

    public Person(int id, String name, boolean isLaessig) {
        this.id = id;
        this.name = name;
        this.isLaessig = isLaessig;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLaessig() {
        return isLaessig;
    }

    public void setLaessig(boolean laessig) {
        isLaessig = laessig;
    }

}
