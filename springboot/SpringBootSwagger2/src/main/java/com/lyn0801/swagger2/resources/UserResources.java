/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyn0801.swagger2.resources;

import com.lyn0801.swagger2.model.UserInfo;
import com.lyn0801.swagger2.service.UserService;
import com.lyn0801.swagger2.service.impl.UserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author lyn0801
 */
@Api(value="用户服务")
@RestController
@RequestMapping(value = "/user")
public class UserResources {
    @Autowired
    private UserService userService = new UserServiceImpl();

    @ApiOperation(value = "查询用户信息",notes = "通过用户ID查询对应用户信息")
    @ApiImplicitParam(name = "id",value = "所查询用户的ID",required = true, dataType = "int", example = "0")
    @RequestMapping(value = "/id", method = RequestMethod.GET)
    public UserInfo getUserById(@RequestParam(value = "id", required = true) int id) {
        System.out.println("开始查询...");
        return userService.getUserById(id);
    }

//    @ApiOperation(value = "查询用户信息",notes = "通过用户ID查询对应用户信息")
//    @ApiImplicitParam(name = "id",value = "所查询用户的ID",required = true, dataType = "int", paramType="path", example = "0")
//    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
//    public UserInfo getUserByIdByPath(@PathVariable (value = "id", required = true) int id) {
//        System.out.println("开始查询...");
//        return userService.getUserById(id);
//    }

    @ApiOperation(value = "添加用户信息",notes = "添加用户信息")
    @ApiImplicitParam(name = "user",value = "所添加用户的具体信息",required = true, dataType = "UserInfo", paramType="body")
    @ApiResponse(code = 200, message = "添加成功")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public boolean addUser(@RequestBody UserInfo user) {
        System.out.println("开始添加...");
        return userService.addUser(user);
    }

    @ApiOperation(value = "修改用户信息",notes = "修改用户信息")
    @ApiImplicitParam(name = "user",value = "所修改用户的具体信息",required = true, dataType = "UserInfo", paramType="body")
    @ApiResponse(code = 200, message = "修改成功")
    @RequestMapping(value = "/modify", method = RequestMethod.PUT)
    public boolean modifyUser(@RequestBody UserInfo user) {
        System.out.println("开始修改...");
        return userService.modifyUser(user);
    }

    @ApiOperation(value = "删除用户信息",notes = "删除用户信息")
    @ApiImplicitParam(name = "id",value = "所删除用户的ID",required = true, dataType = "int", paramType="path", example = "0")
    @ApiResponse(code = 200, message = "删除成功")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public boolean deleteUserById(@PathVariable(value = "id", required = true) int id) {
        System.out.println("开始删除...");
        return userService.deleteUserById(id);
    }

    @ApiOperation(value="获取用户列表", notes="")
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<UserInfo> getAllUsers() {
        System.out.println("开始查询...");
        return userService.getAllUsers();
    }
}
