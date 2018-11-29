/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyn0801.springboot.restful.client;

import com.lyn0801.springboot.restful.model.User;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author marstor
 */
public class UserClient {
    public final static String URI = "http://localhost:8080/user";
    private static Client client = ClientBuilder.newClient();
    private static WebTarget target = client.target(URI);
    
    public static void getUserById() {
        target = client.target(URI+"/id").queryParam("id", 1);
        Response response = target.request().accept(MediaType.APPLICATION_JSON).buildGet().invoke();
        System.out.println(response.getStatus());
        String responseEntity = response.readEntity(String.class);
        System.out.println(responseEntity);
    }
    
    public static void getUserByIdByPath() {
        target = client.target(URI+"/id/2");
        Response response = target.request().accept(MediaType.APPLICATION_JSON).buildGet().invoke();
        System.out.println(response.getStatus());
        String responseEntity = response.readEntity(String.class);
        System.out.println(responseEntity);
    }
    
    public static void addUser() {
        target = client.target(URI+"/add");
        User user = new User();
        user.setId(4);
        user.setName("赵六");
        user.setAge(11);
        String result = target.request(MediaType.APPLICATION_JSON).post(Entity.entity(user, MediaType.APPLICATION_JSON), String.class);
        System.out.println(result);
    }
    
    public static void modifyUser() {
        target = client.target(URI+"/modify");
        User user = new User();
        user.setId(4);
        user.setName("赵六1");
        user.setAge(11);
        String result = target.request().put(Entity.entity(user, MediaType.APPLICATION_JSON), String.class);
        System.out.println(result);
    }
    
    public static void deleteUserById() {
        target = client.target(URI+"/delete").queryParam("id", 4);
        Response response = target.request().accept(MediaType.APPLICATION_JSON).buildDelete().invoke();
        System.out.println(response.getStatus());
        String responseEntity = response.readEntity(String.class);
        System.out.println(responseEntity);
    }
    
    public static void getAllUsers() {
        target = client.target(URI+"/all");
        Response response = target.request().accept(MediaType.APPLICATION_JSON).buildGet().invoke();
        System.out.println(response.getStatus());
        String responseEntity = response.readEntity(String.class);
        System.out.println(responseEntity);
    }
}
