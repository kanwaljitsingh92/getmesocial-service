package com.example.getmesocialservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.getmesocialservice.model.Album;

public interface AlbumRepository extends MongoRepository<Album, String> {// Album is type and ID type is String

	List<Album> findByName(String name);
}
	