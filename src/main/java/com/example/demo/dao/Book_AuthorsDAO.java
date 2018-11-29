package com.example.demo.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.domain.Book_Authors; //Remember to import
import com.example.demo.domain.Book_AuthorsMapper;

@Component
public class Book_AuthorsDAO {
	
	@Autowired
	Book_AuthorsMapper book_AuthorsMapper;
	
	public List<Book_Authors> getAuthorNames()
	{
		List<Book_Authors> AuthorList = new ArrayList<Book_Authors>();
		AuthorList = book_AuthorsMapper.getAuthorNames();
		return AuthorList;
	}
}
