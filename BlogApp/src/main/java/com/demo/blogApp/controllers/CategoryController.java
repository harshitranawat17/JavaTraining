package com.demo.blogApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.blogApp.payloads.ApiResponse;
import com.demo.blogApp.payloads.CategoryDto;
import com.demo.blogApp.services.CategoryService;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;

@RestController
@SecurityRequirement(name = "Blog Application")
@RequestMapping("/api/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	//create
	@PostMapping("/")
	public ResponseEntity<CategoryDto> createCategory(@Valid @RequestBody CategoryDto categoryDto){
		CategoryDto createdDto = this.categoryService.createCategory(categoryDto);
		return new ResponseEntity<CategoryDto>(createdDto, HttpStatus.CREATED);
	}
	
	//update
	@PutMapping("/{CategoryId}")
	public ResponseEntity<CategoryDto> updateCategory(@Valid @RequestBody CategoryDto categoryDto,@PathVariable("CategoryId") Integer categoryId){
		CategoryDto updateCategorydto = this.categoryService.updateCategory(categoryDto, categoryId);
		return new ResponseEntity<CategoryDto>(updateCategorydto,HttpStatus.OK);
		
	}
	
	//getsinglecategory
	@GetMapping("/{CategoryId}")
	public ResponseEntity<CategoryDto> getSingleCategory(@RequestBody CategoryDto categoryDto,@PathVariable("CategoryId") Integer categoryId){
		return ResponseEntity.ok(this.categoryService.getCategory(categoryId));
	}
	
	//getallcategory
	@GetMapping("/")
	public ResponseEntity<List<CategoryDto>> getAllCategory(){
		return ResponseEntity.ok(this.categoryService.getAllCategories());
	}
	
	//deletecategory
	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/{CategoryId}")
	public ResponseEntity<ApiResponse> deleteCategory(@PathVariable("CategoryId") Integer categoryId){
		this.categoryService.deleteCategory(categoryId);
		return new ResponseEntity<ApiResponse>(new ApiResponse("Category Deleted Successfully", true),HttpStatus.OK);
		
	}
	
}
