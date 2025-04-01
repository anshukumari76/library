package com.library.service;

import com.library.model.Book;
import java.util.ArrayList;
import java.util.List;

public class LibraryService{
	private List<Book> books;
	
	public LibraryService() {
		this.books = new ArrayList<>();
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public List<Book> getAllBooks(){
		return books;
	}
}