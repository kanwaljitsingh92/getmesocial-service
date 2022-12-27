package com.example.getmesocialservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.getmesocialservice.model.Comment;

public interface CommentRepository extends MongoRepository<Comment,String> {

	List<Comment> findByCreatedBy(String createdBy);

}
