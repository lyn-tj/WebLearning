package com.lyn0801.springboot.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootEurekaClientApplication.class, args);
    }
}
