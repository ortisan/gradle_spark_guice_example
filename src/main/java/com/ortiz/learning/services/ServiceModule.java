package com.ortiz.learning.services;

import com.google.inject.AbstractModule;

public class ServiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(IPersonService.class).to(PersonService.class);
    }
}
