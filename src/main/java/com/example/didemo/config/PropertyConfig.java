package com.example.didemo.config;

import com.example.didemo.examplebeans.FakeDataSource;
import com.example.didemo.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertyConfig {

    @Value("${didemo.username}")
    String user;

    @Value("${didemo.password}")
    String password;

    @Value("${didemo.dburl}")
    String url;

    @Value("${didemo.jms.username}")
    String jmsUsername;

    @Value("${didemo.jms.password}")
    String jmsPassword;

    @Value("${didemo.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker jmsBroker = new FakeJmsBroker();
        jmsBroker.setUsername(jmsUsername);
        jmsBroker.setPassword(jmsPassword);
        jmsBroker.setUrl(jmsUrl);
        return jmsBroker;
    }
}
