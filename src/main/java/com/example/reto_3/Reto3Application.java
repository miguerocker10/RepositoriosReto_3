package com.example.reto_3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"Controller", "Model", "Repository", "Service"})
@EntityScan("Model")
@EnableJpaRepositories("Repository")
public class Reto3Application {

    public static void main(String[] args) {
        SpringApplication.run(Reto3Application.class, args);
    }

}