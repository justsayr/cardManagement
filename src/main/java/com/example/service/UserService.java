package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.User;
import com.example.repository.IUserRepo;

@Service
public class UserService {

	@Autowired
	IUserRepo repo;

	public User getUserById(Integer id) {
		return repo.findOne(id);
	}

	public void saveUser(User user) {
       repo.save(user);
		
	}

	public void deleteUser(int id) {
		repo.delete(id);
	}
	
}
