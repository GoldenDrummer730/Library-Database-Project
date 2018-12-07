package com.example.demo.domain;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface Book_LoansMapper {
	@Select("SELECT BookId, BranchId, CardNo, DateOut, DueData, DateIn, rating from BOOK_Loans") 
	List<Book_Loans> getAllLoanInfo();
	
	@Select("SELECT BookID from BOOK_COPIES")
	List<Book_Copies> getBookId();
}
