package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Book;
import com.example.demo.service.BookService;

@RestController
public class BookController {
    
	
	BookService bs;
	
	@Autowired
	public BookController(BookService bs) {
		super();
		this.bs = bs;
	}
  
     

	@GetMapping("/getBooks")
	public List<Book> getBooks(){
		return bs.getAllBooks();
	} 
}
