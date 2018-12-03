package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.domain.Book_Authors;

@Mapper
public interface Book_AuthorsMapper {
	@Select("SELECT AuthorName from BOOK_AUTHORS")
	List<Book_Authors> getAuthorNames();
}
