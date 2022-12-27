package com.example.getmesocialservice.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.getmesocialservice.model.User;
import com.example.getmesocialservice.userservice.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService theuserservice;
    
	@GetMapping()
	public List<User> getuser() {
		return theuserservice.getuser();	
	}
	@PostMapping()
    public User saveUser(@RequestBody User theuser) {	
	   return theuserservice.saveUser(theuser);
   }
	@PutMapping()
	public User updateUser(@RequestBody User theuser) {
		return theuserservice.updateUser(theuser);
	}
	@DeleteMapping()
	public void deleteuser(@RequestParam String userId) {
		 theuserservice.deleteuser(userId);
	}
	@GetMapping("/find")
	public List<User> getByname(@RequestParam String address) {
		return theuserservice.getbyname(address);
	}
	
}
