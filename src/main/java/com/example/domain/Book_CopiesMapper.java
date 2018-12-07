package com.example.demo.domain;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface Book_CopiesMapper {
	@Select("SELECT BookId, BranchId, No_Of_Copies from BOOK_COPIES") 
	List<Book_Copies> getCopies();
	
	@Select("SELECT BookID from BOOK_COPIES")
	List<Book_Copies> getBookId();
	
	@Select("SELECT Title, No_Of_Copies FROM BOOK_COPIES bc, Book b, Library_Branch lb"
			+ " WHERE bc.BranchId = bl.BranchId AND lb.BranchName = #{branchname}"
			+ " AND b.bookId = bc.bookId")
	List<Book_Copies> getBranchCopies(String branchname);
	
	@Select("SELECT No_Of_Copies" + 
			"FROM Book_Copies bc, Library_Branch lb, Book b" + 
			"WHERE bc.BranchId = lb.BranchId AND "
			+ "b.bookid = bc.BookID AND b.Title = #{bookname} AND lb.BranchName = #{branch}")
	int getCopiesOfBookFromBranch(String bookname, String branch);
}
