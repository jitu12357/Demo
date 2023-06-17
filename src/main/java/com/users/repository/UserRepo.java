package com.users.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.users.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	
//	@Query("Select U from User u")
//	public List<User> getAll();

}
