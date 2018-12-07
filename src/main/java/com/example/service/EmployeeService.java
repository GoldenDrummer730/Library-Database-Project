package com.example.demo.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.domain.Employee;


@Component
public class EmployeeService {
	
	@Autowired
	EmployeeDAO empDAO;
	
	public EmployeeService() {
		
	}

	public List<Employee> getEmpList() {
		List<Employee> empList = new ArrayList<Employee>();
		//EmployeeDAO empDAO = new EmployeeDAO();
		empList = empDAO.getEmpList();
		return empList;
	}
	

	
	public void insertEmployee(Employee employee) {
		EmployeeDAO empDAO = new EmployeeDAO();
		empDAO.insertEmployee(employee);

	}

	public Employee getEmployee(Employee employee) {
		return empDAO.getEmployee(employee);
		
	}

	public void updateEmployee(Employee employee) {
		empDAO.updateEmployee(employee);
		
	}
	
	

}
