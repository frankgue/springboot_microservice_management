package com.gkfcsolution.userservice.service;

import com.gkfcsolution.userservice.entity.User;
import com.gkfcsolution.userservice.entity.dto.Department;
import com.gkfcsolution.userservice.entity.dto.ResponseDto;
import com.gkfcsolution.userservice.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created on 2025 at 13:26
 * File: null.java
 * Project: springboot_microservice_management
 *
 * @author Frank GUEKENG
 * @date 08/10/2025
 * @time 13:26
 */
@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        log.info("Inside saveUser of UserService");
        return userRepository.save(user);
    }

    public ResponseDto getUserWithDepartment(Long userId) {
        log.info("Inside getUserWithDepartment of UserService");
        User user = userRepository.findByUserId(userId);
        Department department = restTemplate
                .getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(), Department.class);
        ResponseDto responseDto =ResponseDto.builder()
                .department(department)
                .user(user)
                .build();
        return responseDto;
    }
}
