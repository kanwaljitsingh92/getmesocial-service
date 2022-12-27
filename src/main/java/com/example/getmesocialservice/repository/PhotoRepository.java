package com.example.getmesocialservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.getmesocialservice.model.Photo;

public interface PhotoRepository extends MongoRepository<Photo,String>{

	

	List<Photo> findByPhotourl(String photourl);

	

}
