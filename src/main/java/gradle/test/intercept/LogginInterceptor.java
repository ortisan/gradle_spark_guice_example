package gradle.test.intercept;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogginInterceptor implements MethodInterceptor {

    private static Logger logger = LoggerFactory.getLogger(LogginInterceptor.class);

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        try {
            logger.info("Executing method " + invocation.getMethod().getName());
            Object obj = invocation.proceed();
            return obj;
        } catch (Exception exc) {
            logger.error("Error");
            throw exc;
        }
    }
}
