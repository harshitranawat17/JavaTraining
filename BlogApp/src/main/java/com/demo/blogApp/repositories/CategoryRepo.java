package com.demo.blogApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.blogApp.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
