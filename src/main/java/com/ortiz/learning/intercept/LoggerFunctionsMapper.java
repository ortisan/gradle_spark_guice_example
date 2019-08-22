package com.ortiz.learning.intercept;

import com.ortiz.learning.model.HttpCommonsContextObject;
import com.ortiz.learning.model.LoggerInfo;

import java.util.function.Function;

public class LoggerFunctionsMapper {
    public static Function<HttpCommonsContextObject, LoggerInfo> httpCommonsToLogInfo = (contextObject) -> {
        return new LoggerInfo("Execucao de uma requisição http commons", contextObject.getResponse().getEntity().toString());
    };
}
