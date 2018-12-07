package com.example.demo.domain;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface Book_AuthorsMapper {
	@Select("SELECT AuthorName from BOOK_AUTHORS") 
	List<Book_Authors> getAuthorNames();
}
