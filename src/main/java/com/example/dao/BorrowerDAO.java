package com.example.demo.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.domain.Borrower;
import com.example.demo.domain.BorrowerMapper;


@Component
public class BorrowerDAO {
	
	@Autowired
	BorrowerMapper borrowerMapper;
	
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
	

}
