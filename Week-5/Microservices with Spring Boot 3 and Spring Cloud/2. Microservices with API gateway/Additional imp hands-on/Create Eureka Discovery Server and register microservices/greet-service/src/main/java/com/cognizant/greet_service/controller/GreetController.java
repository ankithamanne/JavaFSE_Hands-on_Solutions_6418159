package com.cognizant.greetservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetController {

    @GetMapping("/greet")
    public String greet() {
        return "Hello World";
    }
}
