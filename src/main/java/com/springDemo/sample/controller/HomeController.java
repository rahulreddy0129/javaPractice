package com.springDemo.sample.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(HttpServletRequest request) {
        return "Happy to start spring boot" + request.getSession().getId();
    }

    @RequestMapping("/about")
    public String start() {
        return "Happy coding";
    }
}
