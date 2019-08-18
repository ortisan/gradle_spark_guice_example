package com.ortiz.learning.controllers;

import com.google.inject.AbstractModule;
import com.google.inject.Injector;
import com.google.inject.Singleton;
import spark.Service;

import java.util.Arrays;
import java.util.List;


public class ControllerModule extends AbstractModule {

    private List<Class<? extends SparkController>> controllersClasses = Arrays.asList(
            RestfulConfigController.class,
            ErrorController.class,
            HealthController.class,
            PersonController.class);

    @Override
    protected void configure() {
        for (Class<? extends SparkController> clazzController : controllersClasses) {
            bind(clazzController).in(Singleton.class);
        }
    }

    public void initControllers(Service service, Injector injector) {
        for (Class<? extends SparkController> clazzController : controllersClasses) {
            SparkController instance = injector.getInstance(clazzController);
            instance.init(service);
        }

    }
}
