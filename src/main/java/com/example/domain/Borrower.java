package com.example.demo.domain;

import java.math.BigInteger;

public class Borrower {
	private String CardNo;
	private String NAME;
	private String Address;
	private String Phone;
	private String Password;
	
	public Borrower(String cardNo, String NAME, String address, String phone, String password) {
		super();
		CardNo = cardNo;
		NAME = NAME;
		Address = address;
		Phone = phone;
		Password = password;
	}

	public Borrower()
	{
		
	}
	
	public String getCardNo() {
		return CardNo;
	}

	public void setCardNo(String cardNo) {
		CardNo = cardNo;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
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

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "Borrower [CardNo=" + CardNo + ", NAME=" + NAME + ", Address=" + Address + ", Phone=" + Phone
				+ ", Password=" + Password + "]";
	}

	
}
	
	

