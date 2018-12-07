package com.example.demo.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.BookDAO;
import com.example.demo.domain.Book;


@Component
public class BookService {
	
	@Autowired
	BookDAO bookDAO;
	
	public BookService() {
		
	}

	public List<Book> getBookList() {
		List<Book> bookList = new ArrayList<Book>();
		//BookDAO bookDAO = new BookDAO();
		bookList = bookDAO.getBookList();
		return bookList;
	}
	
	
	

}
