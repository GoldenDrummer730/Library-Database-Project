package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.domain.Publisher;

public interface PublisherMapper {
	
		@Select("SELECT Name, Address, Phone FROM PUBLISHER")
		List<Publisher> getPublisherInfo();
}
