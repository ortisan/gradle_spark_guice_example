package com.ortiz.learning.services;

import com.ortiz.learning.model.ContextObject;
import spark.Request;
import spark.Response;

public interface IContextObjectFactory {

    ContextObject create(Request request, Response response);

}