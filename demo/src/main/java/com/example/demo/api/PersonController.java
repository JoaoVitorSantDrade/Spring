package com.example.demo.api;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;

public class PersonController {
    private final PersonService personService;

    /**
     * @param personService
     */
    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    public void addPerson(Person person) {
        personService.addPerson(person);
    }
}