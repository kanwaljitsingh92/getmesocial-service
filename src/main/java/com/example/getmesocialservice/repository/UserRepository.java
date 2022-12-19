package com.example.getmesocialservice.repository;

import org.springframework.stereotype.Repository;

import com.example.getmesocialservice.user.User;

@Repository
public class UserRepository {
	
	public User getuser() {
		User theuser = new User("kawal","canada",27,"http://profilepic");
		return theuser;
	}

}
