package com.example.santander_dev_2024.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.example.santander_dev_2024.domain.model.User;
import com.example.santander_dev_2024.domain.repository.UserRepository;
import com.example.santander_dev_2024.service.UserService;

@Service
public class userServiceImpl implements UserService {

    private UserRepository userRepository;

    public userServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);

    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This ACCOUNT already exists");
        }
        return userRepository.save(userToCreate);
    }
}
