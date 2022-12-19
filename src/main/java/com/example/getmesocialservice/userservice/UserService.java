package com.example.getmesocialservice.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.getmesocialservice.repository.UserRepository;
import com.example.getmesocialservice.user.User;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userrepo;
	
	public User getuser() {
		
		return userrepo.getuser();
		
	}

}
