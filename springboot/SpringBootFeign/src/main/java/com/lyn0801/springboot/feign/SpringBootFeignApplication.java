package com.lyn0801.springboot.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringBootFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootFeignApplication.class, args);
    }
}
