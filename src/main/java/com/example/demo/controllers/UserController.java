package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.domains.UserDto;
import com.example.demo.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UserController {
    @Autowired UserService userService;
    @PostMapping("/users")
    public Map<String, String> join(@RequestBody UserDto user){
        Map<String, String> map = new HashMap<>();
        int result = userService.join(user);
        return map;
    }
    
}
