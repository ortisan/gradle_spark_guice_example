package com.ortiz.learning;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.ortiz.learning.controllers.ControllerModule;
import com.ortiz.learning.intercept.LoggerModule;
import com.ortiz.learning.services.ServiceModule;
import spark.Service;

public class App {

    public static void main(String[] args) {
        Service service = Service.ignite().port(9088).threadPool(20);
        Injector injector = Guice.createInjector(new ControllerModule(), new ServiceModule(), new LoggerModule());
        ControllerModule controllerModule = injector.getInstance(ControllerModule.class);
        controllerModule.initControllers(service, injector);
    }
}
