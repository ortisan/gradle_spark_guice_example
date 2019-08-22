package com.ortiz.learning.intercept;

import com.ortiz.learning.model.HttpCommonsContextObject;
import com.ortiz.learning.model.LoggerInfo;

import java.util.function.Function;

public enum LoggerMapperEnum {

    HTTP_COMMONS(LoggerFunctionsMapper.httpCommonsToLogInfo);

    LoggerMapperEnum(Function<HttpCommonsContextObject, LoggerInfo> httpCommonsToLogInfo) {



    }
}
