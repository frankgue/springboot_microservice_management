package com.gkfcsolution.userservice.controller;

import com.gkfcsolution.userservice.entity.User;
import com.gkfcsolution.userservice.entity.dto.ResponseDto;
import com.gkfcsolution.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created on 2025 at 13:27
 * File: null.java
 * Project: springboot_microservice_management
 *
 * @author Frank GUEKENG
 * @date 08/10/2025
 * @time 13:27
 */
@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/save")
    public User saveUser(@RequestBody User user){
        log.info("Inside saveUser of UserController");
        return userService.saveUser(user);
    }
    @GetMapping(value = "/{id}")
    public ResponseDto getUserWithDepartment(@PathVariable("id") Long userId){
        log.info("Inside getUserWithDepartment of UserController");
        return userService.getUserWithDepartment(userId);
    }
}
