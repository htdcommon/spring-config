package com.sensetime.spring.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${boot.name}")
    private String name;

    @Value("${boot.ip}")
    private String ip;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String getHello() {

        return "hello " + name + " " + ip;
    }
}
