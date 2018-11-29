package com.example.demo.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.Book_AuthorsDAO;
import com.example.demo.domain.Book_Authors;

@Component
public class Book_AuthorService {
	
	@Autowired
	Book_AuthorsDAO book_authorsDAO;
	public Book_AuthorService()
	{
		
	}
	
	public List<Book_Authors> getAuthorNames()
	{
		List<Book_Authors> AuthorList = new ArrayList<Book_Authors>();
		Book_AuthorsDAO book_authorsDAO = new Book_AuthorsDAO();
		AuthorList = book_authorsDAO.getAuthorNames();
		return AuthorList;
	}
}
