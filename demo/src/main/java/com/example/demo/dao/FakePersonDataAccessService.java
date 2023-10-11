package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Person;

@Repository("FakeDao")
public class FakePersonDataAccessService implements PersonDao {

    private static List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID uuid, Person person) {
        // TODO Auto-generated method stub
        DB.add(new Person(uuid, person.getName()));
        return 1;
    }
    
}
    