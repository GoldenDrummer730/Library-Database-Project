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
import com.example.demo.domain.Book_Copies;
import com.example.demo.domain.Book_CopiesMapper;

@Component
public class Book_CopiesDAO {
	
	@Autowired
	Book_CopiesMapper book_CopiesMapper;
	
	public List<Book_Copies> getBookCopies() //Remember to update in mapper
	{
		List<Book_Copies> CopiesList = new ArrayList<Book_Copies>();
		CopiesList = book_CopiesMapper.getCopies();
		return CopiesList;
	}
	public List<Book_Copies> getBookId()
	{
		List<Book_Copies> BCBookIds = new ArrayList<Book_Copies>();
		BCBookIds = book_CopiesMapper.getBookId();
		return BCBookIds;
	}
	
	public List<Book_Copies> getBranchCopies(String branchName)
	{
		List<Book_Copies> branchCopies = new ArrayList<Book_Copies>();
		branchCopies = book_CopiesMapper.getBranchCopies(branchName);
		return branchCopies;	
	}
	
	public int getCopiesOfBookFromBranch(String bookname, String branch)
	{
		int copiesAtBranch = book_CopiesMapper.getCopiesOfBookFromBranch(bookname, branch);
		return copiesAtBranch;
	}
	
}