package com.example.demo.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.domain.Book_Loans;
import com.example.demo.domain.Book_LoansMapper;


@Component
public class Book_LoansDAO {
	
	@Autowired
	Book_LoansMapper bookLoansMapper;
	
	public Book_LoansDAO() {
		
	}
	

}
