package com.example.exception.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.exception.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

Optional<User> findById(Integer id);


}
