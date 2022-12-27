package com.example.getmesocialservice.userservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.getmesocialservice.model.Album;
import com.example.getmesocialservice.repository.AlbumRepository;

@Service
public class AlbumService {
	
	@Autowired
	AlbumRepository albumrepo;
	

	public Album saveAlbum(Album thealbum) {
		return albumrepo.save(thealbum);
	}


	public List<Album> getallalbum() {
		return albumrepo.findAll();
	
	}


	public Album updatealbum(Album thealbum) {
		
		return albumrepo.save(thealbum);
	}


	public void deleteAlbum(String theId) {
	
		albumrepo.deleteById(theId);;
	}


	public List<Album> findByName(String name) {
		
		return albumrepo.findByName(name);
	}
	

}
