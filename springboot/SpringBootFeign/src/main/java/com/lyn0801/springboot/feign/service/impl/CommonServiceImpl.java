package com.lyn0801.springboot.feign.service.impl;

import com.lyn0801.springboot.feign.feign.VolumeFeign;
import com.lyn0801.springboot.feign.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonServiceImpl implements CommonService {
    @Autowired
    private VolumeFeign volumeFeign;

    @Override
    public String getPort() {
        return volumeFeign.getPort();
    }
}
