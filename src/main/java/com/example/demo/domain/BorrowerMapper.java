package com.example.demo.domain;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BorrowerMapper {
  @Insert("INSERT INTO borrower ...")
  void insertBorrower(Borrower b);

  @Select("SELECT name FROM borrower WHERE cardno = #{cardno}")
  Borrower getBorrowerByCardNo(Borrower b);

}
