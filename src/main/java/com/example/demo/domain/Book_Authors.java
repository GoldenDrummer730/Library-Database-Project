package com.example.demo.domain;

import java.math.BigDecimal;
public class Book_Authors {
	@Override
	public String toString() {
		return "Book_Authors [AuthorName=" + AuthorName + ", BookId=" + BookId + "]";
	}


	private String AuthorName;
	private long BookId;
	
	
	/**
	 * @param AuthorName
	 * @param BookId
	 */
	
	public Book_Authors(String AuthorName, long BookId)
	{
		super();
		this.AuthorName = AuthorName;
		this.BookId = BookId;
	}


	public String getAuthorName() {
		return AuthorName;
	}


	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}


	public long getBookId() {
		return BookId;
	}


	public void setBookId(long bookId) {
		BookId = bookId;
	}
	
	
}
