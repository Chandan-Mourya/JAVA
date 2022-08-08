package com.masai;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public List<Book> getAllBook(){
		
		return bookService.getAllBooks();
	}
	
	@RequestMapping("/book/{id}")
	public Book getBookById(@PathVariable Integer id) {
		
		if(bookService.getBookById(id).equals(null)) {
			new ExceptionClass("Book Not Found");
		}
		
		
		return bookService.getBookById(id);
		
	}
	
	//@RequestMapping(method=RequestMethod.POST, value="/book")
	@PostMapping("/addbook")
	public String addBook(Book book) {
		
		bookService.addBook(book);
		
		return "Added Successfully";
		
		
	}
	
	//DELETE
	@DeleteMapping("/book/{id}")
	public String deleteBook(@PathVariable Integer id) {
		
		bookService.deleteBook(id);
		
		
		return "Deleted Successfully";
	}
}



















