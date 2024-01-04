package com.alt.altbackendassignment.service;

import com.alt.altbackendassignment.domain.Person;

import java.util.ArrayList;

public interface PersonService {
    public void register(Person person);
    public void delete(Long idx);
    public ArrayList<Person> getPersons(String name);
}
