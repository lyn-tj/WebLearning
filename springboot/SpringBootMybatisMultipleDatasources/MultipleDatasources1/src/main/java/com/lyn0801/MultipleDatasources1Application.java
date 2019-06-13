package com.lyn0801;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.lyn0801.mapper")
@Slf4j
public class MultipleDatasources1Application {
    public static void main(String[] args) {
        SpringApplication.run(MultipleDatasources1Application.class, args);
        log.info("Application is running.");
    }
}
