package com.example.demo.domain;


public class Book_Loans 
{
	private String BookId;
	private String BranchId;
	private String CardNo;
	private String DateOut;
	private String DueDate;
	private String DateIn;
	private int rating;
	
	public Book_Loans(String bookId, String branchId, String cardNo, String dateOut, String dueDate, String dateIn,
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

	public Book_Loans()
	{
		
	}
	public String getBookId() {
		return BookId;
	}

	public void setBookId(String bookId) {
		BookId = bookId;
	}

	public String getBranchId() {
		return BranchId;
	}

	public void setBranchId(String branchId) {
		BranchId = branchId;
	}

	public String getCardNo() {
		return CardNo;
	}

	public void setCardNo(String cardNo) {
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
