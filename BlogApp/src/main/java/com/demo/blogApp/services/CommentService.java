package com.demo.blogApp.services;

import com.demo.blogApp.payloads.CommentDto;

public interface CommentService {

	//create Comment
	CommentDto createComment(CommentDto commentDto, Integer PostId);
	
	//delete comment
	void deleteComment(Integer CommentId);
	
}
