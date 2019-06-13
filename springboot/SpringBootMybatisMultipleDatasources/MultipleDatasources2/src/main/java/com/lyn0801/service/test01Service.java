package com.lyn0801.service;

import com.lyn0801.bean.User;
import com.lyn0801.dao.test01Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class test01Service {
    @Autowired
    private test01Dao test01;

    public void test01AddUser(User user){
        test01.addUser(user);
    }
}
