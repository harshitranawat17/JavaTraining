package com.demo.blogApp.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.blogApp.entities.Category;
import com.demo.blogApp.exceptions.ResourceNotFoundEception;
import com.demo.blogApp.payloads.CategoryDto;
import com.demo.blogApp.repositories.CategoryRepo;
import com.demo.blogApp.services.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryRepo categoryRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CategoryDto createCategory(CategoryDto categoryDto) {
		
		Category category = this.categoryDtoToCategory(categoryDto);
		Category savedcategory = this.categoryRepo.save(category);
		return this.categoryToCategoryDto(savedcategory);
	}

	@Override
	public CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId) {

		Category category = this.categoryRepo.findById(categoryId).orElseThrow(() -> new ResourceNotFoundEception("Category","Category Id" , categoryId));
		
		category.setCategoryTitle(categoryDto.getCategoryTitle());
		category.setCategoryDescription(categoryDto.getCategoryDescription());
		
		Category updatedcategory = this.categoryRepo.save(category);
		return this.categoryToCategoryDto(updatedcategory);
	}

	@Override
	public void deleteCategory(Integer categoryId) {
		Category category1 = this.categoryRepo.findById(categoryId).orElseThrow(() -> new ResourceNotFoundEception("Category","Category Id" , categoryId));
		this.categoryRepo.delete(category1);

	}

	@Override
	public CategoryDto getCategory(Integer categoryId) {
		
		Category category1 = this.categoryRepo.findById(categoryId).orElseThrow(() -> new ResourceNotFoundEception("Category","Category Id" , categoryId));
		return this.categoryToCategoryDto(category1);
	}

	@Override
	public List<CategoryDto> getAllCategories() {
		
		List<Category> categories = this.categoryRepo.findAll();
		
		List<CategoryDto> Dtocategories = categories.stream().map(categorie -> this.categoryToCategoryDto(categorie)).collect(Collectors.toList());
		
		return Dtocategories;
	}
	
	public Category categoryDtoToCategory(CategoryDto categoryDto) {
		
		Category category = this.modelMapper.map(categoryDto, Category.class);
		return category;
	}
	
	public CategoryDto categoryToCategoryDto(Category category) {
		
		CategoryDto categoryDto = this.modelMapper.map(category, CategoryDto.class);
		return categoryDto;
	}

}
