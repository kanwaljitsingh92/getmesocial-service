package com.example.getmesocialservice.userservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.getmesocialservice.model.Comment;
import com.example.getmesocialservice.repository.CommentRepository;
@Service
public class CommentService {
	
	@Autowired
	CommentRepository thecmntrepo;
	
	public Comment saveComment(Comment thecomment) {
		return thecmntrepo.save(thecomment);
	}

	public List<Comment> getAllComment() {
		
		return thecmntrepo.findAll();
	}

	public Comment updateComment(Comment thecomment) {
	
		return thecmntrepo.save(thecomment);
	}

	public void deleteComment(String id) {
		thecmntrepo.deleteById(id);
		
	}

	public List<Comment> getbycreator(String createdBy) {
		
		return thecmntrepo.findByCreatedBy(createdBy);
	}
	
   
}
