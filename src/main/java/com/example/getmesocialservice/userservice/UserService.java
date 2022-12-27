package com.example.getmesocialservice.userservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.getmesocialservice.model.User;
import com.example.getmesocialservice.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userrepo;
	
	public List<User> getuser() {
		
		return userrepo.findAll();
	}

	public User saveUser(User theuser) {
		
		return userrepo.save(theuser);
	}

	public User updateUser(User theuser) {
		return userrepo.save(theuser);
	}

	public void deleteuser(String userId) {
		 userrepo.deleteById(userId);;
	
}

	public List<User> getbyname(String address) {
		return userrepo.findByAddress(address);
		
	}
}
