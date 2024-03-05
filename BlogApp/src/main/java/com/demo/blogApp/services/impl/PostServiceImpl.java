package com.demo.blogApp.services.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.demo.blogApp.entities.Category;
import com.demo.blogApp.entities.Post;
import com.demo.blogApp.entities.User;
import com.demo.blogApp.exceptions.ResourceNotFoundEception;
import com.demo.blogApp.payloads.PageResponse;
import com.demo.blogApp.payloads.PostDto;
import com.demo.blogApp.repositories.CategoryRepo;
import com.demo.blogApp.repositories.PostRepo;
import com.demo.blogApp.repositories.UserRepo;
import com.demo.blogApp.services.PostService;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	private PostRepo postRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private CategoryRepo categoryRepo;
	
	@Override
	public PostDto createPost(PostDto postDto, Integer userId, Integer CategoryId) {
		
		User user = this.userRepo.findById(userId).orElseThrow(() -> new ResourceNotFoundEception("User", "User Id", userId));
		
		Category category = this.categoryRepo.findById(CategoryId).orElseThrow(()-> new ResourceNotFoundEception("Category", "Category Id", CategoryId));
		
		Post post = this.modelMapper.map(postDto, Post.class);
		post.setImageName("default.png");
		post.setAddedDate(new Date());
		
		post.setUser(user);
		post.setCategory(category);
		
		
		Post newPost = this.postRepo.save(post);
		
		return this.modelMapper.map(newPost, PostDto.class);
	}

	@Override
	public PostDto updatePost(PostDto postDto, Integer postId) {

		Post post = this.postRepo.findById(postId).orElseThrow(()-> new ResourceNotFoundEception("Post", "Post Id", postId));

		post.setTitle(postDto.getTitle());
		post.setContent(postDto.getContent());
		post.setImageName(postDto.getImageName());
		
		Post updatedpost = this.postRepo.save(post);
		
		return this.modelMapper.map(updatedpost, PostDto.class);
	}

	@Override
	public void deletePost(Integer postId) {	
		
	    Post post = this.postRepo.findById(postId).orElseThrow(()-> new ResourceNotFoundEception("Post", "Post Id", postId));
	    this.postRepo.delete(post);
	}

	//get all post using
	@Override
	public PageResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir) {
		
		Sort sort = null;
		if(sortDir.equalsIgnoreCase("asc")) {
			
			sort = Sort.by(sortBy).ascending();
		}else {
			sort = Sort.by(sortBy).descending();
		}
		
		//get page number and size
		Pageable page = PageRequest.of(pageNumber, pageSize, sort);

		Page<Post> pages = this.postRepo.findAll(page);
		
		//convert to pages to list of posts
		List<Post> posts  = pages.getContent();
		
		List<PostDto> postdtos = posts.stream().map(post -> this.modelMapper.map(post, PostDto.class)).collect(Collectors.toList());
	
		PageResponse pageResponse = new PageResponse();
		
		pageResponse.setContent(postdtos);
		pageResponse.setPageNumber(pages.getNumber());
		pageResponse.setPageSize(pages.getSize());
		pageResponse.setTotalElements(pages.getTotalElements());
		pageResponse.setTotalPages(pages.getTotalPages());
		pageResponse.setLastPage(pages.isLast());
		pageResponse.setEmptyPage(pages.isEmpty());
		
		
		return pageResponse;
	}

	@Override
	public PostDto getPostById(Integer postId) {
		
		Post post = this.postRepo.findById(postId).orElseThrow(()-> new ResourceNotFoundEception("Post", "Post Id", postId));
		return this.modelMapper.map(post, PostDto.class);
	}

	@Override
	public PageResponse getPostByUser(Integer userId, Integer pageNumber, Integer pageSize) {
		
		User user = this.userRepo.findById(userId).orElseThrow(() -> new ResourceNotFoundEception("User", "userId", userId));
		
		Pageable page = PageRequest.of(pageNumber, pageSize);
		
		Page<Post> pages = this.postRepo.findByUser(user, page);
		
		List<Post> posts = pages.getContent();
		
		List<PostDto> postdtos = posts.stream().map((post)-> this.modelMapper.map(post, PostDto.class)).collect(Collectors.toList());
		
		PageResponse pageResponse = new PageResponse();
		
		pageResponse.setContent(postdtos);
		pageResponse.setPageNumber(pages.getNumber());
		pageResponse.setPageSize(pages.getSize());
		pageResponse.setTotalElements(pages.getTotalElements());
		pageResponse.setTotalPages(pages.getTotalPages());
		pageResponse.setLastPage(pages.isLast());
		pageResponse.setEmptyPage(pages.isEmpty());
		
		return pageResponse;
	}

	@Override
	public List<PostDto> getPostByCategory(Integer categoryId) {
		
		Category category = this.categoryRepo.findById(categoryId).orElseThrow(()-> new ResourceNotFoundEception("Category", "category Id", categoryId));
		
		List<Post> posts = this.postRepo.findByCategory(category);
		
		List<PostDto> postdtos = posts.stream().map((post)-> this.modelMapper.map(post, PostDto.class)).collect(Collectors.toList());

		return postdtos;
	}

	@Override
	public List<PostDto> searchPostByTitle(String keyword) {
		
		List<Post> posts = this.postRepo.searchByTitle("%"+keyword+"%");
		
		List<PostDto> postdtos = posts.stream().map((post)-> this.modelMapper.map(post, PostDto.class)).collect(Collectors.toList());

		
		return postdtos;
	}
	

}
