package com.example.demo.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.BorrowerDAO;
import com.example.demo.dao.EmployeeDAO;
import com.example.demo.domain.Borrower;
import com.example.demo.domain.*;

@Component
public class BorrowerService {
	
	@Autowired
	BorrowerDAO borrowerDAO;
	
	public BorrowerService() {
		
	}

	public List<Borrower> getAllBorrowerInfo() {
		List<Borrower> borrowerList = new ArrayList<Borrower>();
		
		borrowerList = borrowerDAO.getAllBorrowerInfo();
		return borrowerList;
	}
	
	public List<CheckedOutBooks> getCheckedOut(Borrower borrower)
	{
		List<CheckedOutBooks> checkedOutList = new ArrayList<CheckedOutBooks>();
		checkedOutList = borrowerDAO.getCheckedOut(borrower);
		return checkedOutList;
	}
	public void insertNewBorrower(Borrower borrower)
	{
		BorrowerDAO borrowerDAO = new BorrowerDAO();
		borrowerDAO.insertNewBorrower(borrower);
	}
	
	public boolean checkLogin(String cardno, String pass)
	{
		System.out.println(cardno + "HELLO" +  pass); //Pass in a borrower object with the method?
		BorrowerDAO borrowerDAO = new BorrowerDAO();
		return borrowerDAO.checkLogin(cardno, pass);
	}

}
