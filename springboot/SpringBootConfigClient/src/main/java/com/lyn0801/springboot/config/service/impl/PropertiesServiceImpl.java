package com.lyn0801.springboot.config.service.impl;

import com.lyn0801.springboot.config.bean.Properties;
import com.lyn0801.springboot.config.dao.PropertiesDao;
import com.lyn0801.springboot.config.service.PropertiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertiesServiceImpl implements PropertiesService {
    @Autowired
    private PropertiesDao propertiesDao;

    @Override
    public List<Properties> getProperties() {
        return propertiesDao.getProperties();
    }
}
