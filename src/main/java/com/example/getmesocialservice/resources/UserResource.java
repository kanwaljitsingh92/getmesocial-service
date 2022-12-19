package com.example.getmesocialservice.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.getmesocialservice.user.User;
import com.example.getmesocialservice.userservice.UserService;

@RestController
@RequestMapping("/api")
public class UserResource {
	
	@Autowired
	private UserService theuserservice;
    
	@GetMapping("/user")
	public User getuser() {
		return theuserservice.getuser();
		
	}
}
