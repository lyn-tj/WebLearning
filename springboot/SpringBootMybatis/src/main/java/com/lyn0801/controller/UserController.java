package com.lyn0801.controller;

import com.lyn0801.entity.UserResponse;
import com.lyn0801.service.UserService;
import com.lyn0801.util.MybatisLogger;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;

@RestController
public class UserController {
//    private static Logger logger = MybatisLogger.getLogger("SpringBootMybatis");
    @Autowired
    private UserService userService;
    private static RestTemplate restTemplate;
    static {
        restTemplate = new RestTemplate();
//        List<HttpMessageConverter<?>> messageConverters = restTemplate.getMessageConverters();
//        messageConverters.remove(6);
//        messageConverters.add(6, new GsonHttpMessageConverter());
//        messageConverters.add(new GsonHttpMessageConverter());
    }

    @RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
    public UserResponse getAllUsers(){
        UserResponse userResponse = new UserResponse();
        userResponse.setUsers(userService.getAllUsers());
        userResponse.setHTTP_Code(200);
        userResponse.setHTTP_Message("");
        userResponse.setCode(0);
        userResponse.setMessage_CN("成功");
        userResponse.setMessage_EN("success");
        userResponse.setResourceID(0);
        return userResponse;
    }

    @RequestMapping(value = "/getAllUsersByClient", method = RequestMethod.GET)
    public UserResponse getAllUsersByClient(){
        ResponseEntity<UserResponse> responseEntity = restTemplate.getForEntity("http://localhost:8080/getAllUsers", UserResponse.class);
        UserResponse responseList = responseEntity.getBody();
//        logger.debug("获取用户列表["+ responseList.getCode() + " : " +responseList.getMessage_CN()+"]");
        return responseEntity.getBody();
    }
}
