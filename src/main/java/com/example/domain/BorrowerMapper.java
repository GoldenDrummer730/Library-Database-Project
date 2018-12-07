package com.example.demo.domain;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface BorrowerMapper {

	@Select("SELECT CardNo, NAME, Address, Phone, Password FROM Borrower")
	List<Borrower> getAllBorrowerInfo();
	
	@Insert("INSERT into Borrower .... ")
	void insertNewBorrower(Borrower borrower);
}
