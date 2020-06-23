package com.jorgedirkx.data;

import com.jorgedirkx.model.Person;

import java.util.List;

public interface PersonDao {
    boolean createPerson(Person person);
    Person readPerson(int id);
    boolean updatePerson(Person person);
    boolean deletePerson(Person person);
    List<Person> getAllPersons();
}
