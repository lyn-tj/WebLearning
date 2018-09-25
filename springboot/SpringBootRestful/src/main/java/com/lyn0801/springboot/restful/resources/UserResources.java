/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyn0801.springboot.restful.resources;

import com.lyn0801.springboot.restful.model.User;
import com.lyn0801.springboot.restful.service.UserService;
import com.lyn0801.springboot.restful.service.impl.UserServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author marstor
 */
@RestController
@RequestMapping(value = "/user")
public class UserResources {
    @Autowired
    private UserService userService = new UserServiceImpl();

    @RequestMapping(value = "/id", method = RequestMethod.GET)
    public User getUserById(@RequestParam(value = "id", required = true) int id) {
        System.out.println("start to query by id...");
        return userService.getUserById(id);
    }
    
    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    public User getUserByIdByPath(@PathVariable (value = "id", required = true) int id) {
        System.out.println("start to query with id...");
        return userService.getUserById(id);
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public boolean addUser(@RequestBody User user) {
        System.out.println("start to add...");
        return userService.addUser(user);
    }
    
    @RequestMapping(value = "/modify", method = RequestMethod.PUT)
    public boolean modifyUser(@RequestBody User user) {
        System.out.println("start to modify...");
        return userService.modifyUser(user);
    }
    
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public boolean deleteUserById(@RequestParam(value = "id", required = true) int id) {
        System.out.println("start to delete...");
        return userService.deleteUserById(id);
    }
    
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        System.out.println("start to query all...");
        return userService.getAllUsers();
    }
}
