package com.lyn0801.controller;

import com.lyn0801.entity.Auth;
import com.lyn0801.entity.AuthRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TokenController {
    @RequestMapping(value = "/getToken", method = RequestMethod.GET)
    public static String getToken(@RequestParam String username, @RequestParam String password) {
        RestTemplate restTemplate = new RestTemplate();
        Auth au = new Auth();
        au.setUsername(username);
        au.setPassword(password);
        AuthRequest param = new AuthRequest();
        param.setAuth(au);
        ResponseEntity<String> authDomain = restTemplate.postForEntity("http://192.168.1.107:80/v1/auth/tokens", param, String.class);
        return authDomain.getHeaders().get("X-Marstor-Token").get(0);
    }
}
