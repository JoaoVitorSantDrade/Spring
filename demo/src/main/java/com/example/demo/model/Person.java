package com.example.demo.model;

import java.util.UUID;

public class Person {
    
    private final UUID id;
    private final String name;

    /**
     * @return the id
     */
    public UUID getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    public Person(UUID id ,String Name){
        this.id = id;
        this.name = Name;
    }

}
