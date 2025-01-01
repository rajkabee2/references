package com.example.demo;

import java.time.ZoneId;
import java.util.TimeZone;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import jakarta.annotation.PostConstruct;

@Configuration
public class JacksonConfig {

    @PostConstruct
    public void init(){
        // Set JVM default timezone
        TimeZone.setDefault(TimeZone.getTimeZone(ZoneId.systemDefault()));
    }

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());

        // Configure the objectMapper to use the system's default timezone
        objectMapper.setTimeZone(TimeZone.getTimeZone(ZoneId.systemDefault()));
        
        return objectMapper;
    }
}
