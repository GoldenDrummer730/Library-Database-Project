package com.example.demo.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.domain.Employee;

public class EmployeeService {
	
	@Autowired
	EmployeeDAO empDao;
	
	public EmployeeService() {
		
	}


	
	
	public List<Employee> getEmpList() {
		List<Employee> empList = new ArrayList<Employee>();
		
		empList = empDao.getEmpList();
		return empList;
	}
	
	/*
	
	public List<Employee> getEmpListBySalary(BigDecimal salary) {
		List<Employee> empList = new ArrayList<Employee>();
		EmployeeDAO empDAO = new EmployeeDAO();
		empList = empDAO.getEmpListBySalary(salary);
		return empList;
	}
	
	public List<HashMap<String,Object>> getDepts() {
		List<HashMap<String,Object>> deptList = new ArrayList<HashMap<String,Object>>();
		EmployeeDAO empDAO = new EmployeeDAO();
		deptList = empDAO.getDepts();
		return deptList;
	}
	
	public void insertEmployee(Employee e) {
		EmployeeDAO empDAO = new EmployeeDAO();
		empDAO.insertEmployee(e);
	}
	
	public void updateSalary(String ssn) {
		EmployeeDAO empDAO = new EmployeeDAO();
		empDAO.updateSalary(ssn);
	}
	
	public String getEmployeeBySSN(String ssn) {
		EmployeeDAO empDAO = new EmployeeDAO();
		Employee e;
		e = empDAO.getEmployeeBySSN(ssn);
		
		return e.getFname() + " " + e.getLname();
	}
	
	public BigDecimal getSalaryBySSN(String ssn) {
		
		EmployeeDAO empDAO = new EmployeeDAO();
		Employee e;
		e = empDAO.getEmployeeBySSN(ssn);
		
		return e.getSalary();
		
	}
	*/
	

}
