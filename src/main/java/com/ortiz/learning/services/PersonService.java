package com.ortiz.learning.services;

import com.google.inject.Inject;
import com.ortiz.learning.model.Address;
import com.ortiz.learning.model.ContextObject;
import com.ortiz.learning.model.Person;
import spark.Request;

import java.util.Arrays;

public class PersonService implements IPersonService {

    private ContextObject contextObject;

    @Inject
    public PersonService(ContextObject contextObject) {
        this.contextObject = contextObject;
    }

    public Person getPerson() {
        Request request = contextObject.getRequest();
        System.out.println("request = " + request);
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
