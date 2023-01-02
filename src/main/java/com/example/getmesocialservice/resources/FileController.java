package com.example.getmesocialservice.resources;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.services.ecs.model.Attachment;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.model.S3Object;
import com.example.getmesocialservice.userservice.FileService;

@RestController
@RequestMapping("api/file")
public class FileController {

	@Autowired
	FileService thefileservice;
	
	@PostMapping
  public boolean upLoadFile(@RequestParam MultipartFile thefile) {
	 return thefileservice.uploadfile(thefile);
 }
	
	@GetMapping("/view")
	public void view(@RequestParam(name="key") String key, HttpServletResponse response) throws IOException {
		S3Object object=thefileservice.getfile(key);
		response.setContentType(object.getObjectMetadata().getContentType());
		response.getOutputStream().write(object.getObjectContent().readAllBytes());
	}
   @GetMapping("/download")
    public ResponseEntity<Resource> download(@RequestParam(name="key") String key) throws IOException{
	   S3Object object=thefileservice.getfile(key);
		return ResponseEntity.ok()
				.contentType(MediaType.parseMediaType(object.getObjectMetadata().getContentType()))
				.header(Headers.CONTENT_DISPOSITION, "attachment; filename=\""+ key + "\"")
				.body(new ByteArrayResource(object.getObjectContent().readAllBytes()));
}
@DeleteMapping("/delete")
public void delete(@RequestParam String key) {
	thefileservice.deletefile(key);
}
}


