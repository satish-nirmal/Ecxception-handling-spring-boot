package com.example.exception.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.dto.UserRequest;
import com.example.exception.entity.User;
import com.example.exception.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUsers() {
		
		
		return ResponseEntity.ok(userService.getAllUsers());
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<Optional<User>> getUser(@PathVariable Integer id){
		
		return ResponseEntity.ok(userService.getUser(id)); 
	}
	
	@PostMapping("/user/{id}")
	public ResponseEntity<User> saveUser(@RequestBody UserRequest userRequest) {
		
		return new ResponseEntity<>(userService.saveUser(userRequest), HttpStatus.CREATED);
	}
}
