package com.example.domain;

import java.math.BigDecimal;

public class Employee {
	private String fname;
	private String lname;
	private String ssn;
	private BigDecimal salary;
	
	
	
	/**
	 * @param fname
	 * @param lname
	 * @param ssn
	 * @param salary
	 */
	public Employee(String fname, String lname, String ssn, BigDecimal salary) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.ssn = ssn;
		this.salary = salary;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [fname=" + fname + ", lname=" + lname + ", ssn=" + ssn + ", salary=" + salary + "]";
	}
	
	
	

}
