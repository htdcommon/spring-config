package com.sensetime.spring.controller;

import com.sensetime.spring.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private MyConfig myConfig;

    @RequestMapping("/user")
    public String getUser() {

        return "user " + myConfig.getName() + " " + myConfig.getIp();
    }
}
