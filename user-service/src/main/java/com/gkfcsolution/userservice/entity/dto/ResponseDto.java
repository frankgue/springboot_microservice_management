package com.gkfcsolution.userservice.entity.dto;

import com.gkfcsolution.userservice.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created on 2025 at 13:34
 * File: null.java
 * Project: springboot_microservice_management
 *
 * @author Frank GUEKENG
 * @date 08/10/2025
 * @time 13:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseDto {
    private User user;
    private Department department;
}
