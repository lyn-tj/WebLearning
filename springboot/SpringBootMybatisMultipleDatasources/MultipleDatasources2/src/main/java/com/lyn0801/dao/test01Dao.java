package com.lyn0801.dao;

import com.lyn0801.bean.User;
import com.lyn0801.mapper.test01.test01Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class test01Dao {
    @Autowired
    private test01Mapping test01;

    public void addUser(User user){
        test01.addUser(user);
    }
}
