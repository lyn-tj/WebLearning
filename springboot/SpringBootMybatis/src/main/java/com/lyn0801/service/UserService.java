package com.lyn0801.service;

import com.lyn0801.entity.User;
import com.lyn0801.entity.UserInfo;
import com.lyn0801.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUsers(){
        return userMapper.getAllUsers();
    }

}
