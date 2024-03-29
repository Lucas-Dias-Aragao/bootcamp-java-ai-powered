package com.springsecurityjwt.controller;

import com.springsecurityjwt.model.User;
import com.springsecurityjwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService service;
    @PostMapping
    public void postUser(@RequestBody User user){
        service.createUser(user);
    }
}


// https://github.com/digitalinnovationone/dio-springboot/tree/main/dio-spring-security-jwt/src/main/java/dio/dio/spring/security/jwt