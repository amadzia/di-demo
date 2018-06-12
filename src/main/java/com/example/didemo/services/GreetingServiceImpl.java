package com.example.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO = "Hello - Greeting Service Impl";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
