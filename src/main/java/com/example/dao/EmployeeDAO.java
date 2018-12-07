package com.example.demo.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.domain.Employee;
import com.example.demo.domain.EmployeeMapper;


@Component
public class EmployeeDAO {
	
	@Autowired
	EmployeeMapper employeeMapper;
	
	public EmployeeDAO() {
		
	}

	public List<Employee> getEmpList() {
		List<Employee> empList = new ArrayList<Employee>();	
		empList = employeeMapper.getEmpList();
		//Employee e1 = new Employee("Test1","Test1 LName","1234",new BigDecimal(10000.00));
		//Employee e2 = new Employee("Test2","Test2 LName","2345",new BigDecimal(20000.00));
		//empList.add(e1);
		//empList.add(e2);
		return empList;
	}
	

	public void insertEmployee(Employee employee) {
		
	}

	public Employee getEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeMapper.getEmployee(employee);
	}

	public void updateEmployee(Employee employee) {
		
		employeeMapper.updateEmployee(employee);
		
	}
	
	

}
