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

import com.example.getmesocialservice.model.Album;
import com.example.getmesocialservice.userservice.AlbumService;

@RestController
@RequestMapping
public class AlbumController {

	@Autowired
	AlbumService thealbumservice;

	@PostMapping
	public Album savealbum(@RequestBody Album thealbum) {
		return thealbumservice.saveAlbum(thealbum);
	}

	@GetMapping
	public List<Album> getallalbum() {
		return thealbumservice.getallalbum();
	}

	@PutMapping
	public Album updateAlbum(@RequestBody Album thealbum) {
		return thealbumservice.updatealbum(thealbum);
	}

	@DeleteMapping
	public void deleteAlbum(@RequestParam String theId) {
		thealbumservice.deleteAlbum(theId);
	}

	@GetMapping("/find")
	public List<Album> findbyName(@RequestParam String name) {
		return thealbumservice.findByName(name);
	}
}
