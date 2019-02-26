package com.example.registration.service;

import com.example.registration.dto.UserRegistrationDto;
import com.example.registration.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
