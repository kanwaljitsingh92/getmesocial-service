package com.example.getmesocialservice.userservice;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.getmesocialservice.model.Photo;
import com.example.getmesocialservice.repository.PhotoRepository;

@Service
public class PhotoService {
	
@Autowired
PhotoRepository thephotorepository;


public Photo savePhoto(Photo thephoto) {
	
	return thephotorepository.save(thephoto);
}


public List<Photo> getallphoto() {
	return thephotorepository.findAll();
}


public Photo updatePhoto(@RequestBody Photo thephoto) {
	return thephotorepository.save(thephoto);
}

public void deletePhoto(String id) {
	 thephotorepository.deleteById(id);
	
}
public List<Photo> getByPhotourl(String photourl) {
	
	return thephotorepository.findByPhotourl(photourl);
}


}
