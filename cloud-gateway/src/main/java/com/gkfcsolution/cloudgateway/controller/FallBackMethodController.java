package com.gkfcsolution.cloudgateway.controller;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> userServiceFallback() {
        return ResponseEntity.ok("Le service Utilisateur est temporairement indisponible. Veuillez réessayer plus tard.");
    }

    @GetMapping("/departmentServiceFallBack")
    public ResponseEntity<String> departmentServiceFallback() {
        return ResponseEntity.ok("Le service Département est temporairement indisponible. Veuillez réessayer plus tard.");
    }
}
