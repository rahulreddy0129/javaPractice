package com.springDemo.sample.controller;

import com.springDemo.sample.model.Users;
import com.springDemo.sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public Users register(@RequestBody Users user) {
        return service.reister(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody Users user) {
        return service.veriyUser(user);
    }
}
