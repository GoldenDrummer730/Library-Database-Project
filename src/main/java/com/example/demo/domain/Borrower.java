package com.example.demo.domain;

import java.math.BigInteger;

public class Borrower {
	private BigInteger cardNo;
	private String name;
	private String address;
	private BigInteger phone;

	public Borrower(BigInteger cardNo, String name, String address, BigInteger phone) {
		super();
		this.cardNo = cardNo;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public BigInteger getcardNo() {
		return cardNo;
	}

	public void setcardNo(BigInteger cardNo) {
		cardNo = cardNo;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		name = name;
	}

	public String getaddress() {
		return address;
	}

	public void setaddress(String address) {
		address = address;
	}

	public BigInteger getphone() {
		return phone;
	}

	public void setphone(BigInteger phone) {
		phone = phone;
	}

	@Override
	public String toString() {
		return "Borrower [cardNo=" + cardNo + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}

}
