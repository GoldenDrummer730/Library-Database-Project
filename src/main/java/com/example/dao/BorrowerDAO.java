package com.example.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.domain.Book_Authors; //Remember to import
import com.example.mapper.Book_AuthorsMapper;
import com.example.domain.Borrower;
import com.example.mapper.BorrowerMapper;

@Component
public class BorrowerDAO{

  @Autowired
  BorrowerMapper bm;

  public List<Borrower> getBorrowerNames(){
    try{
      List<Borrower> borrowerNames = new ArrayList<Borrower>();
      //borrowerNames = bm.getBorrowerNamesByCardNo);
      return borrowerNames;
    }

    catch (Exception e){
      System.out.println("Error in BorrowerDAO");
    }
    
    return null;
  }
}
