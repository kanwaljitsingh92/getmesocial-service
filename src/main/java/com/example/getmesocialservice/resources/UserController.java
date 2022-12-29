package com.example.getmesocialservice.resources;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.getmesocialservice.exception.RestrictedInfoException;
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
    public User saveUser(@Valid @RequestBody User theuser) {	
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
	public User getById(@RequestParam String id) {
		
		return theuserservice.getbyId(id);
	}
	@GetMapping("/find/address")
	public List<User> getByAddress(@RequestParam String address) throws RestrictedInfoException {
		if(address.equalsIgnoreCase("Root")) {
			throw new RestrictedInfoException();
		}
		return theuserservice.getbyaddress(address);
	}
	
}
