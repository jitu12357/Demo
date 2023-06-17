package com.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.users.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
