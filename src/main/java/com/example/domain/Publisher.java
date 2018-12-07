package com.example.demo.domain;

import java.math.BigInteger;

public class Publisher {
	private String Name;
	private String Address;
	private String Phone;
	
	public Publisher(String name, String address, String phone)
	{
		Name = name;
		Address = address;
		Phone = phone;
	}
	
	public Publisher()
	{
		
	}
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
	public String getPhone() {
		return Phone;
	}
	
	public void setPhone(String phone) {
		Phone = phone;
	}
	@Override
	public String toString() {
		return "Publisher [Name=" + Name + ", Address=" + Address + ", Phone=" + Phone + "]";
	}

}
