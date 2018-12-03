package com.example.demo.domain;

public class Book {
	private long bookId;
	private String title;
	private String publisher;
	public Book(long bookId, String title, String publisher) {
		super();
		bookId = bookId;
		title = title;
		publisher = publisher;
	}
	public long getbookId() {
		return bookId;
	}
	public void setbookId(long bookId) {
		bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		publisher = publisher;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", publisher=" + publisher + "]";
	}


}
