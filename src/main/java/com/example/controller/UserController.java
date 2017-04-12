package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.config.BuissnessException;
import com.example.domain.User;
import com.example.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping("/{id}")
	public User getUserById(@PathVariable Integer id) throws BuissnessException{
		User user = service.getUserById(id);
		
		if(null == user){
			throw new BuissnessException("User details not available in DB");
		}
		return user;
	}
	
	@PostMapping()
	public ResponseEntity<?> saveUser(@RequestBody User user){
		
		service.saveUser(user);
		return new ResponseEntity<String>("User saved successfully", HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable int id){
		
		service.deleteUser(id);
		return new ResponseEntity<String>("User saved successfully", HttpStatus.OK);

	}

}
