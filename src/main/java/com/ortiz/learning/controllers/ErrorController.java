package com.ortiz.learning.controllers;

import spark.Service;

public class ErrorController implements SparkController {

    @Override
    public void init(Service service) {
//        initExceptionHandler((e) -> System.out.println("Uh-oh"));
        service.notFound((req, res) -> {
            return "{\"message\":\"Custom 404\"}";
        });
    }
}
