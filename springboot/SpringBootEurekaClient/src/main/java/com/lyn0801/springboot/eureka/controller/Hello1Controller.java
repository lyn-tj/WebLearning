/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyn0801.springboot.eureka.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author marstor
 */
@RestController
@RequestMapping("v1/hello1")
public class Hello1Controller {
    @Value("${server.port}")
    String port;

    @RequestMapping(value = "port", method = RequestMethod.GET)
    public String getPort() {
        return "This is hello1 eureka client and port is " + port;
    }

}
