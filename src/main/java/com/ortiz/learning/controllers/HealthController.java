package com.ortiz.learning.controllers;

import com.google.gson.Gson;
import com.ortiz.learning.model.HealthInfo;
import spark.Service;

public class HealthController implements SparkController {

    @Override
    public void init(Service service) {
        service.get("/health_info", (req, res) -> {
            HealthInfo healthInfo = new HealthInfo();
            healthInfo.setAppName("Testing Gradle Spark and Guice");
            healthInfo.setMessage("Running");
            return healthInfo;
        }, new Gson()::toJson);
    }
}
