package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.pojo.Book;

@Service
public class BookServiceImpl implements BookService {

	@Override
	public List<Book> getAllBooks() {
		
		return Arrays.asList(new Book(1,"Java",250),new Book(2,"CPP",250),new Book(3,"C",250));
	}
          
}
