package com.jorgedirkx.service;

import com.jorgedirkx.model.Person;

import java.util.List;

public interface PersonService {

    Person getPerson(int id);
    List<Person> getAllPersons();
    void addPerson(Person person);
    void addPersons(List <Person> personList);


}
