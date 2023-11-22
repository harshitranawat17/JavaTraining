package com.api.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.entities.Book;
import com.api.book.services.BookService;

@RestController
@ComponentScan(basePackages =  "com.api.book.services")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	//@RequestMapping(value = "/books", method = RequestMethod.GET)
	//@ResponseBody
	@GetMapping("/books") 
	public List<Book> getBooks() {
//		System.out.println(book);
		return this.bookService.getAllBooks();
	}
	
	@GetMapping("/books/{id}")
	public Book getbook(@PathVariable("id") int id) {
		
		return this.bookService.getBookbyId(id);
	}
	
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book) {
		//System.out.println(book);
		Book b = this.bookService.addBook(book);
		return b;
		
	}
	
	//delete book handler
	@DeleteMapping("/books/{bookId}")
	public void deleteBook(@PathVariable("bookId") int bookId) {
		
		this.bookService.deleteBook(bookId);
	}
	
	//update book
	@PutMapping("/books/{bookId}")
	public Book updateBook(@RequestBody Book book ,@PathVariable("bookId") int bookId) {
		
		this.bookService.updateBook(book,bookId);
		return book;
	}
	
}
