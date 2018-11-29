package com.example.demo.domain;

import java.math.BigInteger;

public class Publisher {
	private String Name;
	private String Address;
	private BigInteger Phone;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public BigInteger getPhone() {
		return Phone;
	}
	
	public void setPhone(BigInteger phone) {
		Phone = phone;
	}
	@Override
	public String toString() {
		return "Publisher [Name=" + Name + ", Address=" + Address + ", Phone=" + Phone + "]";
	}

}
