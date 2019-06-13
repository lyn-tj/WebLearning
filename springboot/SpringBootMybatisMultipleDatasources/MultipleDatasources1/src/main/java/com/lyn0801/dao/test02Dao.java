package com.lyn0801.dao;

import com.lyn0801.bean.User;
import com.lyn0801.mapper.test02.test02Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class test02Dao {
    @Autowired
    private test02Mapping test02;

    public void addUser(User user){
        test02.addUser(user);
    }
}
