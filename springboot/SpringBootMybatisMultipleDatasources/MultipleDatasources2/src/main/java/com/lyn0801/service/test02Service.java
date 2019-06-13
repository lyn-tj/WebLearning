package com.lyn0801.service;

import com.lyn0801.bean.User;
import com.lyn0801.dao.test02Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class test02Service {
    @Autowired
    private test02Dao test02;

    public void test02AddUser(User user){
        test02.addUser(user);
    }
}
