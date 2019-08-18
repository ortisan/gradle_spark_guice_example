package com.ortiz.learning.model;

import com.google.gson.annotations.SerializedName;

public class HealthInfo {

    @SerializedName("app_name")
    private String appName;
    private String message;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
