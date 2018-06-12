package com.example.didemo.controllers;

import com.example.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println("Hello from MyController");

        return greetingService.sayGreeting();
    }
}
