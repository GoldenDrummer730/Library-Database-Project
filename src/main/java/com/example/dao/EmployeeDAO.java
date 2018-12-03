package com.example.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import com.example.domain.Employee;

@Component
public class EmployeeDAO {
	
	public EmployeeDAO() {
		
	}

	public List<Employee> getEmpList() {
		List<Employee> empList = new ArrayList<Employee>();
		Employee e1 = new Employee("Test", "Test LNAME", "999887775", new BigDecimal(45000));
		Employee e2 = new Employee("Test2", "Test2 LNAME", "999887776", new BigDecimal(55000));
		return empList;
	}
	
	public List<Employee> getEmpListBySalary(BigDecimal salary) {
		List<Employee> empList = new ArrayList<Employee>();
		
		return empList;
	}
	

	public List<HashMap<String,Object>> getDepts() {
		List<HashMap<String,Object>> deptList = new ArrayList<HashMap<String,Object>>();
	
		return deptList;
	}
	
	public void insertEmployee(Employee e) {
		
	}
	
	public void updateSalary(String ssn) {
		
	}
	
	public Employee getEmployeeBySSN(String ssn) {
		Employee e = null;
		
		
		return e;
	}

}
