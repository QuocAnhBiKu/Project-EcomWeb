package com.example.ecommerce.service.auth;

import com.example.ecommerce.dto.SignupRequest;
import com.example.ecommerce.dto.UserDto;

public interface AuthService {

   UserDto createUser(SignupRequest signupRequest);

    boolean hasUserWithEmail(String email);
}
