package com.api.book.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.api.book.dao.BookRepository;
import com.api.book.entities.Book;

@Service // Add or verify this annotation
@Component
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	//private static List<Book> list = new ArrayList<>();
	
	/*
	 * static { list.add(new Book(12,"java new book1", "abc")); list.add(new
	 * Book(13,"java new book2", "def")); list.add(new Book(14,"java new book3",
	 * "ghi")); }
	 */
	
	//get all books
	public List<Book> getAllBooks(){
	    List<Book> list = (List<Book>)this.bookRepository.findAll();
	    return list;
	}
	
	//get single book by id
	public Book getBookbyId(int id) {
			
	 Book book = null;	
	 try {
	 //book =	list.stream().filter(e->e.getId()==id).findFirst().get();
//		 Optional<Book> optionalBook = this.bookRepository.findById(id);
//		    return optionalBook.orElse(null);
	 book = this.bookRepository.findById(id);
	 }catch (Exception e) {
		// TODO: handle exception
		 e.printStackTrace();
	 }
	 return book;
	}
	
	//create book
	public Book addBook(Book b) {
		
		Book result = this.bookRepository.save(b);
		//list.add(b);
		return result;
	}
	
	//delete book
	public void deleteBook(int bid) {
		
//		for (Book book : list) {
//			if(book.getId() == bid){
//				list.remove(book);
//			}
//		}
		
		this.bookRepository.deleteById(bid);
	}
	
	//update book
	public void updateBook(Book book, int bookId) {
		
//		list = list.stream().map(b->{
//			if(b.getId() == bookId) {
//				b.setTitle(book.getTitle());
//				b.setAuthor(book.getAuthor());
//			}
//			
//			return b;
//		}).collect(Collectors.toList());
		
		book.setId(bookId);
		
		bookRepository.save(book);
		
	}

}
