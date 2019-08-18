package com.ortiz.learning.intercept;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

public class LoggerModule extends AbstractModule {

    @Override
    protected void configure() {
        bindInterceptor(Matchers.any(), Matchers.annotatedWith(HttpLogger.class), new LoggerInterceptor());
    }
}
