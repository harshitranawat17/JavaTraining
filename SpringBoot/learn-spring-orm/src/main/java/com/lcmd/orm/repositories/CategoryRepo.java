package com.lcmd.orm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcmd.orm.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
