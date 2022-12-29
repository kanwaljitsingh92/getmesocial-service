package com.example.getmesocialservice.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.getmesocialservice.model.Comment;
import com.example.getmesocialservice.userservice.CommentService;

@RequestMapping("api/comment")
@RestController
public class CommentController {
	
	@Autowired
	CommentService thecmntservice;
    
	@PostMapping
	public Comment saveComment(@Valid @RequestBody Comment thecomment) {
		return thecmntservice.saveComment(thecomment);
	}
	@GetMapping
	public List<Comment> getallcomment() {
		return thecmntservice.getAllComment();
	}
	@PutMapping
	public Comment updateComment(@RequestBody Comment thecomment) {
		return thecmntservice.updateComment(thecomment);
	}
	@DeleteMapping
	public void deleteComment(@RequestParam String id) {
		 thecmntservice.deleteComment(id);
	}
	@GetMapping("/find")
	public List<Comment> getbycreator(@RequestParam String createdBy ) {
		return thecmntservice.getbycreator(createdBy);
	}
}
