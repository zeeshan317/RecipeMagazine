package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.dto.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
