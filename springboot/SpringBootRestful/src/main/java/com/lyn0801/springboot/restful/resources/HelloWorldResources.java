/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyn0801.springboot.restful.resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lyn0801
 */
@RestController
public class HelloWorldResources {
    @RequestMapping(value="/hi", method=RequestMethod.GET)
    public String getHi(@RequestParam String name){
        return "hi " + name ;
    }
}
