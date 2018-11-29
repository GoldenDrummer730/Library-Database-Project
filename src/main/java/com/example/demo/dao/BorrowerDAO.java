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

@Component
public class BorrowerDAO{

  @Autowired
  BorrowerMapper bm;

  public List<Borrower> getBorrowerNames(){
    try{
      List<Borrower> borrowerNames = new ArrayList<Borrower>();
      bm = new BorrowerMapper();
      borrowerNames = bm.getBorrowerNames();
      return borrowerNames;
    }

    catch (Exception e){
      System.out.println("Error in BorrowerDAO");
    }
  }
}
