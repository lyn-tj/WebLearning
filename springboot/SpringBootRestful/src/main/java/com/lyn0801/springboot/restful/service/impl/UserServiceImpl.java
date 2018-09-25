/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyn0801.springboot.restful.service.impl;

import com.lyn0801.springboot.restful.model.User;
import com.lyn0801.springboot.restful.service.UserService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author lyn0801
 */
@Service
public class UserServiceImpl implements UserService {

    private List<User> userList = new ArrayList<User>();

    public UserServiceImpl() {
        User user = new User();
        user.setId(1);
        user.setName("tom");
        userList.add(user);
        user = new User();
        user.setId(2);
        user.setName("jack");
        userList.add(user);
        user = new User();
        user.setId(3);
        user.setName("john");
        userList.add(user);
    }

    @Override
    public User getUserById(int id) {
        User userResult = null;
        for (User userTemp : userList) {
            if (userTemp.getId() == id) {
                userResult = userTemp;
            }
        }
        return userResult;
    }

    @Override
    public boolean modifyUser(User user) {
        boolean result = true;
        List<User> userListNew = new ArrayList<User>();
        try {
            for (User userTemp : userList) {
                if (user.getId() == userTemp.getId()) {
                    userListNew.add(user);
                } else {
                    userListNew.add(userTemp);
                }
            }
        } catch (Exception e) {
            result = false;
        } finally {
            if (result) {
                userList = userListNew;
            }
        }
        return result;
    }

    @Override
    public boolean addUser(User user) {
        boolean result = true;
        try {
            if (null != userList && !userList.contains(user)) {
                userList.add(user);
            }
        } catch (Exception e) {
            result = false;
        }
        return result;
    }

    @Override
    public boolean deleteUserById(int id) {
        boolean result = true;
        List<User> userListNew = new ArrayList<User>();
        try {
            for (User userTemp : userList) {
                if (id == userTemp.getId()) {

                } else {
                    userListNew.add(userTemp);
                }
            }
        } catch (Exception e) {
            result = false;
        } finally {
            if (result) {
                userList = userListNew;
            }
        }
        return result;
    }

    @Override
    public List<User> getAllUsers() {
        return userList;
    }

}
