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
	
	@Select("SELECT bk.Title, lb.BranchName, bl.DateOut, bl.DateIn\n" + 
			"FROM Book_loans bl, Borrower b, Library_Branch lb, BOOK bk\n" + 
			"WHERE lb.BranchId = bl.BranchId AND bl.BookId = bk.BookId"
			+ "and b.CardNo = bl.CardNo AND b.CardNo = *{CardNo}")
	List<CheckedOutBooks> getCheckedOut(Borrower borrower); //Creates new ChedkedOutBooks object with 
													//Title, BranchName, DateOut, DateIn fields
													//Resolved in the Borrower DAO/Service
}
