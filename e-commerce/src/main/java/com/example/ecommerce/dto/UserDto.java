package com.example.ecommerce.dto;

import com.example.ecommerce.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String email;
    private String name;
    private UserRole role;
}
