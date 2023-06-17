package com.users.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.users.entity.User;
import com.users.repository.UserRepo;

@CrossOrigin("*")
@RestController
@RequestMapping("user")
public class UserControler {

	@Autowired
	private UserRepo userRepo;
	
	@PostMapping("/save")
	public void saveUser(@RequestBody User user) {
		userRepo.save(user);
	}
	
	@GetMapping("/getAll")
	public List<User> getUsers(){
		return userRepo.findAll();
	}
}