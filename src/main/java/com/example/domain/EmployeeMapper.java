package com.example.demo.domain;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface EmployeeMapper {
	@Select("SELECT fname, lname, ssn, salary FROM EMPLOYEE")
	List<Employee> getEmpList();

	@Select("SELECT fname, lname, ssn, salary FROM EMPLOYEE where ssn = #{ssn}")
	Employee getEmployee(Employee employee);
	
	@Update("update employee set fname = #{fname}, lname = #{lname} where ssn = #{ssn}")
	void updateEmployee(Employee employee);
	
	@Insert("insert into employee .... ")
	void insertEmployee(Employee employee);
	
}
