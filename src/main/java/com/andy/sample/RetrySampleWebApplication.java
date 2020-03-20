package com.andy.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class RetrySampleWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(RetrySampleWebApplication.class, args);
    }
}

