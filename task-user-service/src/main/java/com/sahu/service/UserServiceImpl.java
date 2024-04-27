package com.sahu.service;

import com.sahu.config.JwtProvider;
import com.sahu.modal.User;
import com.sahu.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public User getUserProfile(String jwt) {
        return userRepository.findByEmail(JwtProvider.getEmailFromJwtToken(jwt));
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
