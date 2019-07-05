package com.lyn0801.springboot.config.controller;

import com.lyn0801.springboot.config.bean.Properties;
import com.lyn0801.springboot.config.service.PropertiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PropertiesController {
    @Autowired
    private PropertiesService propertiesService;

    @GetMapping(value = "getProperties")
    public List<Properties> getProperties(){
        return propertiesService.getProperties();
    }
}
