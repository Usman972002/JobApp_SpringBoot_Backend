package com.usman.Spring.Boot.REST.controller;

import com.usman.Spring.Boot.REST.model.User;
import com.usman.Spring.Boot.REST.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/registerUser")
    public User register(@RequestBody User user){
        return service.saveUser(user);
    }

}

