package com.lyn0801.controller;

import com.lyn0801.bean.User;
import com.lyn0801.service.test01Service;
import com.lyn0801.service.test02Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {
    @Autowired
    private test01Service test01;
    @Autowired
    private test02Service test02;

    @RequestMapping(value = "/test01/addUser", method = RequestMethod.POST)
    public void addUser1(@RequestBody User user){
        try {
            test01.test01AddUser(user);
            log.info("添加用户成功。");
        }catch (Exception e){
            log.error("添加用户失败。");
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/test02/addUser", method = RequestMethod.POST)
    public void addUser2(@RequestBody User user){
        try {
            test02.test02AddUser(user);
            log.info("添加用户成功。");
        }catch (Exception e){
            log.error("添加用户失败。");
            e.printStackTrace();
        }
    }
}
