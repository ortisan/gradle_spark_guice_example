package com.ortiz.learning.controllers;

import spark.Service;

public class RestfulConfigController implements SparkController {

    @Override
    public void init(Service service) {
        service.after((req, res) -> {
            res.type("application/json");
        });
    }
}
