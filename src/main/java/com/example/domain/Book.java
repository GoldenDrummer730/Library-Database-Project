package com.example.demo.domain;

import java.math.BigDecimal;

public class Book {
	private String BookId;
	private String Title;
	private String Publisher;
	
	
	
	//Remember to create default constructor for other methods
	/**
	 * @param BookId
	 * @param Title
	 * @param Publisher
	 * 
	 */
	public Book(String BookId, String Title, String Publisher) {
		super();
		this.BookId = BookId;
		this.Title = Title;
		this.Publisher = Publisher;
		
	}
	
	public Book()
	{
		
	}

	public String getBookId() {
		return BookId;
	}

	public void setBookId(String bookId) {
		BookId = bookId;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getPublisher() {
		return Publisher;
	}

	public void setPublisher(String publisher) {
		Publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [BookId=" + BookId + ", Title=" + Title + ", Publisher=" + Publisher + "]";
	}
	
}
