package com.demo.blogApp.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.blogApp.entities.Comment;
import com.demo.blogApp.entities.Post;
import com.demo.blogApp.exceptions.ResourceNotFoundEception;
import com.demo.blogApp.payloads.CommentDto;
import com.demo.blogApp.repositories.CommentRepo;
import com.demo.blogApp.repositories.PostRepo;
import com.demo.blogApp.services.CommentService;

@Service
public class CommentServiceImpl implements CommentService {
	
	@Autowired
	private PostRepo postRepo;
	
	@Autowired
	private CommentRepo commentRepo;
	
	@Autowired
	private ModelMapper modelMapper;
 
	@Override
	public CommentDto createComment(CommentDto commentDto, Integer postId) {
	
		Post post = this.postRepo.findById(postId).orElseThrow(()-> new ResourceNotFoundEception("Post", "Post Id", postId));
		
		Comment com = this.modelMapper.map(commentDto, Comment.class);
		
		com.setPost(post);
		
		Comment savedComment = this.commentRepo.save(com);
		
		return this.modelMapper.map(savedComment, CommentDto.class);
	}

	@Override
	public void deleteComment(Integer commentId) {
		
		Comment com = this.commentRepo.findById(commentId).orElseThrow(() -> new ResourceNotFoundEception("Comment", "Comment Id", commentId));
		
		this.commentRepo.delete(com);

	}

}
