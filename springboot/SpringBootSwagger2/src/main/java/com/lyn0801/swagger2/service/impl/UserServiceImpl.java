/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyn0801.swagger2.service.impl;

import com.lyn0801.swagger2.model.UserInfo;
import com.lyn0801.swagger2.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lyn0801
 */
@Service
public class UserServiceImpl implements UserService {

    private List<UserInfo> userList = new ArrayList<UserInfo>();

    public UserServiceImpl() {
        UserInfo user = new UserInfo();
        user.setId(1);
        user.setName("张三");
        userList.add(user);
        user = new UserInfo();
        user.setId(2);
        user.setName("李四");
        userList.add(user);
        user = new UserInfo();
        user.setId(3);
        user.setName("王五");
        userList.add(user);
    }

    @Override
    public UserInfo getUserById(int id) {
        UserInfo userResult = null;
        for (UserInfo userTemp : userList) {
            if (userTemp.getId() == id) {
                userResult = userTemp;
            }
        }
        return userResult;
    }

    @Override
    public boolean modifyUser(UserInfo user) {
        boolean result = true;
        List<UserInfo> userListNew = new ArrayList<UserInfo>();
        try {
            for (UserInfo userTemp : userList) {
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
    public boolean addUser(UserInfo user) {
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
        List<UserInfo> userListNew = new ArrayList<UserInfo>();
        try {
            for (UserInfo userTemp : userList) {
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
    public List<UserInfo> getAllUsers() {
        return userList;
    }

}
