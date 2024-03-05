package com.demo.blogApp.services;	

import java.util.List;

import com.demo.blogApp.entities.Post;
import com.demo.blogApp.payloads.PageResponse;
import com.demo.blogApp.payloads.PostDto;

public interface PostService {
	
	//create
	PostDto createPost(PostDto postDto, Integer userId, Integer CategoryId);
	
	//update
	PostDto updatePost(PostDto postDto, Integer postId);
	
	//delete
	void deletePost(Integer postId);
		
	//get all posts
	PageResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);
	
	//get single post
	PostDto getPostById(Integer postId);
	
	//get post by user
	PageResponse getPostByUser(Integer userId, Integer pageNumber, Integer pageSize);
	
	//get post by category
	List<PostDto> getPostByCategory(Integer categoryId);
	
	//search post by title
	List<PostDto> searchPostByTitle(String keyword);

	
	
}
