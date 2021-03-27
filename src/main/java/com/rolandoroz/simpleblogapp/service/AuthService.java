package com.rolandoroz.simpleblogapp.service;

import com.rolandoroz.simpleblogapp.dto.RegisterRequest;
import com.rolandoroz.simpleblogapp.model.User;
import com.rolandoroz.simpleblogapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;
    public void signup(RegisterRequest registerRequest) {
        User user = new User();
        user.setUserName(registerRequest.getUsername());
        user.setPassword(registerRequest.getPassword());
        user.setEmail(registerRequest.getEmail());
        userRepository.save(user);
    }
}
