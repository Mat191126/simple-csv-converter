package com.codecool;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.codecool")
public class AppConfig {

    @Bean(name = "fileReader")
    public FileReader reader() {
        return new FileReader();
    }

    @Bean(name = "simpleCsvConverter")
    public SimpleCsvConverter csvConverter() {
        return new SimpleCsvConverter();
    }
}
