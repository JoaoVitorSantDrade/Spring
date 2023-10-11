package com.example.demo.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

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

    public Person(  @JsonProperty("id") UUID id ,
                    @JsonProperty("name") String Name){
        this.id = id;
        this.name = Name;
    }

}
