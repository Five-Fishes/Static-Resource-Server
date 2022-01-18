package com.example.reactdeployment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class GreetingController {

    @GetMapping("/greet")
    public String greet() {
        return "hello from backend, hello??";
    }
}
