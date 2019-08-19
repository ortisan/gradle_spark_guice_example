package com.ortiz.learning.model;

import spark.Request;
import spark.Response;

public interface IContextObject {
    Request getRequest();
    Response getResponse();
}
