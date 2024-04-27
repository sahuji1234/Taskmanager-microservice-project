package com.sahu.service;

import com.sahu.modal.User;

import java.util.List;

public interface UserService {
    public User getUserProfile(String jwt);

    public List<User> getAllUsers();
}
