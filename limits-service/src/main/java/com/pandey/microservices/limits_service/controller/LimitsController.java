package com.pandey.microservices.limits_service.controller;


import com.pandey.microservices.limits_service.configuration.Configuration;
import com.pandey.microservices.limits_service.limits.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LimitsController {
    //public Limits limit;
    @Autowired
    private Configuration configuration;

    @GetMapping("/hello")
    public String welcome(){
        System.out.println("in hello");
        return "hello 8080";

    }
    @GetMapping("/limits")
    public Limits retrieveLimits(){
        System.out.println("worked");
        return new Limits(configuration.getMinimum(),configuration.getMaximum());

    }
}
