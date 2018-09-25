/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyn0801.springboot.restful.service;

import com.lyn0801.springboot.restful.model.User;
import java.util.List;

/**
 *
 * @author lyn0801
 */
public interface UserService {
    User getUserById(int id);
    boolean addUser(User user);
    boolean modifyUser(User user);
    boolean deleteUserById(int id);
    List<User> getAllUsers();
}
