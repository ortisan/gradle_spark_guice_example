package com.ortiz.learning.controllers;

import com.google.gson.Gson;
import com.google.inject.Inject;
import com.ortiz.learning.services.PersonService;
import spark.Service;

public class PersonController implements SparkController {

    @Inject
    private PersonService personService;

    @Override
    public void init(Service service) {
        service.get("/person", (req, res) -> {
            return personService.getPerson();
        }, new Gson()::toJson);
    }


}
