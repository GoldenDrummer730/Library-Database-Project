package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.domain.Book;

@Mapper
public interface BookMapper {

  @Select("SELECT * FROM book")
  List<Book> getAllBooks();

}
