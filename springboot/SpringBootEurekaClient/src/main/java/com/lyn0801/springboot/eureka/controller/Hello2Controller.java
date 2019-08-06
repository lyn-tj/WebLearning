/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyn0801.springboot.eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author marstor
 */
@RestController
@RequestMapping("v2/hello2")
public class Hello2Controller {
    @Value("${server.port}")
    String port;

    @RequestMapping(value = "port", method = RequestMethod.GET)
    public String getPort() {
        return "This is hello2 eureka client and port is " + port;
    }

}
