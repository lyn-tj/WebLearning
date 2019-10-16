package com.lyn0801.springboot.ssl.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {
    @GetMapping(value = "hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public String hello(){
        return "{\"string\": \"hello\"}";
    }
}
