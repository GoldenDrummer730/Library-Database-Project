package com.example.demo.domain;

import java.math.BigDecimal;
public class Book_Authors {
	@Override
	public String toString() {
		return "Book_Authors [AuthorName=" + AuthorName + ", BookId=" + BookId + "]";
	}


	private String AuthorName;
	private String BookId;
	
	
	/**
	 * @param AuthorName
	 * @param BookId
	 */
	
	public Book_Authors(String AuthorName, String BookId)
	{
		super();
		this.AuthorName = AuthorName;
		this.BookId = BookId;
	}

	public Book_Authors()
	{
		
	}

	public String getAuthorName() {
		return AuthorName;
	}


	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}


	public String getBookId() {
		return BookId;
	}


	public void setBookId(String bookId) {
		BookId = bookId;
	}
	
	
}
