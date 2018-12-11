package com.example.demo.domain;

import java.math.BigDecimal;
public class CheckedOutBooks {
	
	private String Title;
	private String BranchName;
	private String DateOut;
	private String DateIn;
	
	
	
	/**
	 * @param AuthorName
	 * @param BookId
	 */
	
	public CheckedOutBooks(String title, String branchName, String dateOut, String dateIn)
	{
		super();
		this.Title = title;
		this.BranchName = branchName;
		this.DateOut = dateOut;
		this.DateIn = dateIn;
	}

	@Override
	public String toString() {
		return "CheckedOutBooks [Title=" + Title + ", BranchName=" + BranchName + ", DateOut=" + DateOut + ", DateIn="
				+ DateIn + "]";
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getBranchName() {
		return BranchName;
	}

	public void setBranchName(String branchName) {
		BranchName = branchName;
	}

	public String getDateOut() {
		return DateOut;
	}

	public void setDateOut(String dateOut) {
		DateOut = dateOut;
	}

	public String getDateIn() {
		return DateIn;
	}

	public void setDateIn(String dateIn) {
		DateIn = dateIn;
	}

	public CheckedOutBooks()
	{
		
	}

	
}
