package com.example.demo.domain;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PublisherMapper {
	
		@Select("SELECT Name, Address, Phone FROM PUBLISHER")
		List<Publisher> getPublisherInfo();
}
