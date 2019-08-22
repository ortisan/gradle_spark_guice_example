package com.ortiz.learning.model;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpRequestBase;

public class HttpCommonsContextObject {

    private HttpRequestBase request;
    private HttpResponse response;

    public HttpCommonsContextObject(HttpRequestBase request, HttpResponse response) {
        this.request = request;
        this.response = response;
    }

    public HttpRequestBase getRequest() {
        return request;
    }

    public void setRequest(HttpRequestBase request) {
        this.request = request;
    }

    public HttpResponse getResponse() {
        return response;
    }

    public void setResponse(HttpResponse response) {
        this.response = response;
    }
}
