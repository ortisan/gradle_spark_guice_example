package com.ortiz.learning.model;

import com.google.inject.assistedinject.Assisted;
import com.google.inject.assistedinject.AssistedInject;
import spark.Request;
import spark.Response;

public class ContextObject implements IContextObject {

    private Request request;
    private Response response;

    public ContextObject() {
    }

    @AssistedInject
    public ContextObject(@Assisted Request request, @Assisted Response response) {
        this.request = request;
        this.response = response;
    }

    public Request getRequest() {
        return request;
    }

    public Response getResponse() {
        return response;
    }


}
