package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.User;

@Repository
public interface IUserRepo extends JpaRepository<User, Integer> {

}
