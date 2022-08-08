package com.masai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class BookService {
	

		
	private List<Book> list=new ArrayList<>(
			
			Arrays.asList(new Book(101, "Java","John", 500),
					new Book(102, "C++", "Shubham", 750),
					new Book(103,"Javascript","Vijay",840),
					new Book(104, "Python", "Sujit", 750),
					new Book(105,"Perl","Chandan",840)
				));
	
	
//	Book b1=new Book(101, "Java","John", 500);
//	Book b2=new Book(102, "C++", "Shubham", 750);
//	Book b3=new Book(103,"Javascript","Vijay",840);
//	Book b4=new Book(104, "Python", "Sujit", 750);
//	Book b5=new Book(105,"Perl","Chandan",840);

	
	
	public List<Book> getAllBooks(){
		
		return list;
	}
	
	public Book getBookById(Integer bookid) {
		
		return list.stream().filter( t-> t.getBookId().equals(bookid)).findFirst().get();
	}
	
	//POST
	public String addBook(Book book) {
		
		list.add(book);
		
		return "Created New Book";
	}
	
	//DELETE
	public String deleteBook(Integer book) {
		
		list.removeIf(t -> t.getBookId().equals(book));
		
		return "Removed Successfully";
	}
	
}
