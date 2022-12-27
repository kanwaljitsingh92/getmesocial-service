package com.example.getmesocialservice.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.getmesocialservice.model.Photo;
import com.example.getmesocialservice.userservice.PhotoService;

@RestController
@RequestMapping("/api/photo")
public class PhotoController {

	@Autowired
	PhotoService thephotoservice;

	@PostMapping
	public Photo savePhoto(@RequestBody Photo thephoto) {
		return thephotoservice.savePhoto(thephoto);
	}
	
	@GetMapping
	public List<Photo> getallPhoto() {
		return thephotoservice.getallphoto();
	}
	
   @PutMapping
   public Photo updatePhoto(@RequestBody Photo thephoto) {
	return thephotoservice.updatePhoto(thephoto);
	
	   
   }
   @DeleteMapping
   public void deletePhoto(@RequestParam String id) {
	    thephotoservice.deletePhoto(id);
   }
   @GetMapping("/find")
   public  List<Photo> getByPhotourl(@RequestParam String photourl) {
	   return thephotoservice.getByPhotourl(photourl);
   }
}
