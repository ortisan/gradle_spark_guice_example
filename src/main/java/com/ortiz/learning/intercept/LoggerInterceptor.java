package com.ortiz.learning.intercept;

import com.google.inject.Inject;
import com.ortiz.learning.services.PersonService;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;


public class LoggerInterceptor implements MethodInterceptor {

    private static Logger logger = LoggerFactory.getLogger(LoggerInterceptor.class);

    @Inject
    private PersonService personService;

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        try {
            logger.info("Executing method Before" + invocation.getMethod().getName());
            readAnnotationOn(invocation.getMethod());
            Object obj = invocation.proceed();
            return obj;
        } catch (Exception exc) {
            logger.error("Error");
            throw exc;
        }
    }

    private static void readAnnotationOn(AnnotatedElement element) {
        try {
            System.out.println("\n Finding annotations on " + element.getClass().getName());
            Annotation[] annotations = element.getAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof HttpLogger) {
                    HttpLogger httpLogger = (HttpLogger) annotation;
                    System.out.println("Message :" + httpLogger.message());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public PersonService getPersonService() {
        return personService;
    }

    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }


}
