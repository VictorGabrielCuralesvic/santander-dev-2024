package com.example.santander_dev_2024.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.santander_dev_2024.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);

}