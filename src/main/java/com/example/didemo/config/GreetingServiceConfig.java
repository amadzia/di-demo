package com.example.didemo.config;

import com.example.didemo.repositories.GreetingRepository;
import com.example.didemo.services.GreetingService;
import com.example.didemo.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository repository) {
        return new GreetingServiceFactory(repository);
    }

    @Bean
    @Primary
    @Profile({"en", "default"})
    GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile("de")
    GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("de");
    }

    @Bean
    @Primary
    @Profile("pl")
    GreetingService primaryPolishGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("pl");
    }
}
