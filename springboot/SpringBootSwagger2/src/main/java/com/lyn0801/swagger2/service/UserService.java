/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyn0801.swagger2.service;


import com.lyn0801.swagger2.model.UserInfo;

import java.util.List;

/**
 *
 * @author lyn0801
 */
public interface UserService {
    UserInfo getUserById(int id);
    boolean addUser(UserInfo user);
    boolean modifyUser(UserInfo user);
    boolean deleteUserById(int id);
    List<UserInfo> getAllUsers();
}
