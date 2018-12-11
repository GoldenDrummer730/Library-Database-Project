package com.example.demo.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.domain.Borrower;
import com.example.demo.domain.BorrowerMapper;
import com.example.demo.domain.*;

@Component
public class BorrowerDAO {
	
	@Autowired
	BorrowerMapper borrowerMapper;
	Book_LoansMapper bookloanMapper;
	
	public BorrowerDAO() {
		
	}

	public List<Borrower> getAllBorrowerInfo() {
		List<Borrower> borrowerList = new ArrayList<Borrower>();	
		borrowerList = borrowerMapper.getAllBorrowerInfo();
		return borrowerList;
	}

	public void insertNewBorrower(Borrower borrower) {
		// TODO Auto-generated method stub
		
	}
	
	public List<CheckedOutBooks> getCheckedOut(Borrower borrower)
	{
		List<CheckedOutBooks> checkedOutList = new ArrayList<CheckedOutBooks>();
		checkedOutList = bookloanMapper.getCheckedOut(borrower);
		return checkedOutList;
	}
	public boolean checkLogin(String cardno, String pass)
	{
		List<Borrower> borrowerList = new ArrayList<Borrower>();
		System.out.println((cardno == null) + "cardno = " + cardno);
		System.out.println((pass == null + "pass = " + pass));
		System.out.println("In the DAO");
		borrowerList = borrowerMapper.checkLogin(cardno, pass);
		System.out.println("Passed the mapper");
		if (borrowerList.isEmpty()) //If no match populated.
		{
			return false;
		}
		else return true;
	}

}
