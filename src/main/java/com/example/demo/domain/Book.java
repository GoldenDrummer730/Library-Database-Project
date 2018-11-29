package com.example.demo.domain;

public class Book {
	private long BookId;
	private String Title;
	private String Publisher;
	public Book(long bookId, String title, String publisher) {
		super();
		BookId = bookId;
		Title = title;
		Publisher = publisher;
	}
	public long getBookId() {
		return BookId;
	}
	public void setBookId(long bookId) {
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
