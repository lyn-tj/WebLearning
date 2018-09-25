/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyn0801.springboot.restful.client;

/**
 *
 * @author lyn0801
 */
public class RestfulClientTest {
    public static void main(String[] args) {
        UserClient.getUserById();
        UserClient.getUserByIdByPath();
        UserClient.getAllUsers();
        UserClient.addUser();
        UserClient.getAllUsers();
        UserClient.modifyUser();
        UserClient.getAllUsers();
        UserClient.deleteUserById();
        UserClient.getAllUsers();
    }
}
