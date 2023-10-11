package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PersonDao;
import com.example.demo.model.Person;

@Service
public class PersonService {

    private final PersonDao personDao;

    /**
     * @param personDao
     */
    @Autowired
    public PersonService(@Qualifier("FakeDao") PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person) {
        return personDao.insertPerson(person);
    }

    public List<Person> getAllPeopple(){
        return personDao.selectAllPeople(); 
    }

    public Optional<Person> getPersonById(UUID uuid){
        return personDao.selectPersonById(uuid);
    }

    public int deletePersonById(UUID uuid){
        return personDao.deletePersonById(uuid);
    }

    public int updatePersonById(UUID uuid, Person person){
        return personDao.updatePersonById(uuid, person);
    }

}
