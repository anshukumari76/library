package com.library.model;

public class Book{
	private String title;
	private Author author;
	private int pageCount;
	
	// Constructors
	public Book(String title, Author author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }
	
	// getters, setters, and other methods
	
	@Override
	public String toString() {
		return "Book{" + 
				"title='" + title + '\'' +
				", author=" + author +
				", pageCount=" + pageCount +
				'}';
	}
	
	public String getTitle() {
		return title;
	}
	
	public Author getAuthor() {
		return author;
	}
	
	public int getPageCount() {
		return pageCount;
	}

	public void displayDetails() {
		System.out.println("Book Details: ");
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Page Count: " + pageCount);
	}
}