package com.example.demo.dao;

//import java.math.BigDecimal;
import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.domain.Book;
import com.example.demo.domain.BookMapper;

@Component
public class BookDAO{

  @Autowired
  BookMapper bookMapper;

  public List<Book> getAllBooks(){
    try{
      List<Book> bookList = new ArrayList<Book>();
      bookList = bookMapper.getAllBooks();
      return bookList;
    } catch(Exception e){
      System.out.println("ERROR: An error occured in getAllBooks() in BookDAO");
    }
    
    return null;
  }
  
}
