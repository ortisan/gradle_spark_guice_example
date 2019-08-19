package com.ortiz.learning.services;

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;
import com.ortiz.learning.model.ContextObject;
import com.ortiz.learning.model.IContextObject;

public class ServiceModule extends AbstractModule {

    @Override
    protected void configure() {

        install(new FactoryModuleBuilder()
                .implement(IContextObject.class, ContextObject.class)
                .build(IContextObjectFactory.class));

        bind(IContextObject.class).to(ContextObject.class);
        bind(IPersonService.class).to(PersonService.class);
    }
}
