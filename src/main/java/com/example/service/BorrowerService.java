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
	
	public void insertNewBorrower(Borrower borrower)
	{
		BorrowerDAO borrowerDAO = new BorrowerDAO();
		borrowerDAO.insertNewBorrower(borrower);
	}
	
	

}
