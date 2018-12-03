package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.BookDAO;
import com.example.demo.domain.Book;

@Component
public class BookService{

  @Autowired
  BookDAO bookDAO;


  public List<Book> getAllBooks(){
    try{
      List<Book> booksList = new ArrayList<Book>();
      //bookDAO = new BookDAO();
      booksList = bookDAO.getAllBooks();
      return booksList;
    } catch(Exception e) {
    	System.out.println("ERROR: Error in getAllBooks in BookService");
    }
    
    return null;
  }
}
