package com.library;

import com.library.model.Author;
import com.library.model.Book;
import com.library.service.LibraryService;

public class Main{
	public static void main(String[] args) {
		LibraryService libraryService = new LibraryService();
		
		// creating authors
		Author author1 = new Author("Jane Austen", 41);
		Author author2 = new Author(" Louisa May Alcott", 55);
		Author author3 = new Author("Arundhati Roy", 62);
		
		// Creating books
		Book book1 = new Book("Pride and Prejudice", author1, 496);
		Book book2 = new Book("Little Women", author2, 759);
		Book book3 = new Book("War Talk", author3, 142);
		
		// Adding books to the library
		libraryService.addBook(book1);
		libraryService.addBook(book2);
		libraryService.addBook(book3);
		
		// Displaying all books in the library
		System.out.println("All Books in the Library");
		for (Book book : libraryService.getAllBooks()) {
			System.out.println(book);
		}
		
	}
}