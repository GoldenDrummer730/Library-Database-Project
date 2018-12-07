package com.example.demo.domain;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface Library_BranchMapper {

	@Select("SELECT BranchId, BranchName, Address FROM LIBRARY_BRANCH")
	List<Library_Branch> getAllFromBranch();
}
