package com.api.book.dao;


import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.api.book.entities.Book;

@Repository // Add this annotation
public interface BookRepository extends CrudRepository<Book, Integer>	{
	public Book findById(int id);
}