package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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

    @Override
    public List<Person> selectAllPeople() {
        return DB;
    }

    @Override
    public Optional<Person> selectPersonById(UUID uuid) {
        return DB.stream()
        .filter(person -> person.getId().equals(uuid))
        .findFirst();
    }

    @Override
    public int deletePersonById(UUID uuid) {
        Optional<Person> personMaybe = selectPersonById(uuid);
        if (personMaybe.isPresent()) {
            DB.remove(personMaybe.get());
            return 1;
        }
        return 0;
    }

    @Override
    public int updatePersonById(UUID uuid, Person person) {
        return selectPersonById(uuid)
        .map(p -> {
            int indexOfPersonToUpdate = DB.indexOf(p);
            if (indexOfPersonToUpdate >= 0) {
                DB.set(indexOfPersonToUpdate, new Person(uuid, person.getName()));    
                return 1;
            }
            return 0;
        })
        .orElse(0);
    }
    
}
    