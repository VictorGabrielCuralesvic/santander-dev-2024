package com.example.santander_dev_2024.service;

import com.example.santander_dev_2024.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
    
}