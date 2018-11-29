package com.example.demo.domain;

import java.math.BigInteger;

public class Book_Loans 
{
	private long BookId;
	private long BranchId;
	private BigInteger CardNo;
	private String DateOut;
	private String DueDate;
	private String DateIn;
	private int rating;
	
	public Book_Loans(long bookId, long branchId, BigInteger cardNo, String dateOut, String dueDate, String dateIn,
			int rating) {
		super();
		BookId = bookId;
		BranchId = branchId;
		CardNo = cardNo;
		DateOut = dateOut;
		DueDate = dueDate;
		DateIn = dateIn;
		this.rating = rating;
	}

	public long getBookId() {
		return BookId;
	}

	public void setBookId(long bookId) {
		BookId = bookId;
	}

	public long getBranchId() {
		return BranchId;
	}

	public void setBranchId(long branchId) {
		BranchId = branchId;
	}

	public BigInteger getCardNo() {
		return CardNo;
	}

	public void setCardNo(BigInteger cardNo) {
		CardNo = cardNo;
	}

	public String getDateOut() {
		return DateOut;
	}

	public void setDateOut(String dateOut) {
		DateOut = dateOut;
	}

	public String getDueDate() {
		return DueDate;
	}

	public void setDueDate(String dueDate) {
		DueDate = dueDate;
	}

	public String getDateIn() {
		return DateIn;
	}

	public void setDateIn(String dateIn) {
		DateIn = dateIn;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Book_Loans [BookId=" + BookId + ", BranchId=" + BranchId + ", CardNo=" + CardNo + ", DateOut=" + DateOut
				+ ", DueDate=" + DueDate + ", DateIn=" + DateIn + ", rating=" + rating + "]";
	}
	
	
}
