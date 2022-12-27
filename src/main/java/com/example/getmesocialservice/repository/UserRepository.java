package com.example.getmesocialservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.getmesocialservice.model.User;

public interface UserRepository extends MongoRepository<User,String> {

	List<User> findByAddress(String address);
	

}
