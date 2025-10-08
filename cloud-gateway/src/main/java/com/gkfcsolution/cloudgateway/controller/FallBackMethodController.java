package com.gkfcsolution.cloudgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2025 at 15:27
 * File: null.java
 * Project: springboot_microservice_management
 *
 * @author Frank GUEKENG
 * @date 08/10/2025
 * @time 15:27
 */
@RestController
public class FallBackMethodController {

    @GetMapping("/userServiceFallBack")
    public String userServiceFallBackMethod(){
        return "User Service is taking longer than Expected." +
                " Please try again later";
    }
    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallBackBackMethod(){
        return "Department Service is taking longer than Expected." +
                " Please try again later";
    }
}
