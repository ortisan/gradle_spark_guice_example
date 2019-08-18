package com.ortiz.learning.services;

import com.google.inject.Singleton;
import com.ortiz.learning.model.Address;
import com.ortiz.learning.model.Person;

import java.util.Arrays;

@Singleton
public class PersonService implements IPersonService {

    public Person getPerson() {
        Person person = new Person();
        person.setName("Marcelo");
        person.setLastName("Ortiz");
        Address address = new Address();
        address.setStreet("Rua Sobe Desce Abc");
        address.setCity("Sao Paulo");
        person.setAddresses(Arrays.asList(address));
        return person;
    }
}
