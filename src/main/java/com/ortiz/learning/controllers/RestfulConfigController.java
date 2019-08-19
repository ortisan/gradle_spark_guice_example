package com.ortiz.learning.controllers;

import com.google.inject.Inject;
import com.ortiz.learning.model.ContextObject;
import com.ortiz.learning.services.IContextObjectFactory;
import spark.Service;

public class RestfulConfigController implements SparkController {

    @Inject
    IContextObjectFactory contextObjectFactory;

    @Override
    public void init(Service service) {

        service.before((req, res) -> {
            ContextObject contextObject = contextObjectFactory.create(req, res);
            System.out.println("contextObject = " + contextObject);
        });

        service.after((req, res) -> {
            res.type("application/json");
        });
    }
}
