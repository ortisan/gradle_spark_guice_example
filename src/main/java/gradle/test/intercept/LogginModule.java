package gradle.test.intercept;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

public class LogginModule extends AbstractModule {

    @Override
    protected void configure() {
        bindInterceptor(Matchers.any(), Matchers.annotatedWith(SplunkJsonLogging.class), new LogginInterceptor());
    }
}
