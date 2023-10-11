package com.example.demo.dao;

import java.util.UUID;

import com.example.demo.model.Person;

public interface PersonDao {
    int insertPerson(UUID uuid, Person person);

    default int insertPerson(Person person){
        UUID uuid = UUID.randomUUID();
        return insertPerson(uuid, person);
    }
}
