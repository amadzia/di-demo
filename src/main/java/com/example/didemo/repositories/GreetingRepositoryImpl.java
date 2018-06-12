package com.example.didemo.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello from Repository";
    }

    @Override
    public String getPolishGreeting() {
        return "Witaj z poziomu Repozytorium";
    }

    @Override
    public String getGermanGreeting() {
        return "Hallo aus dem Repository";
    }
}
