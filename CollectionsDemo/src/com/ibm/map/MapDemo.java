package com.ibm.map;

import java.util.HashMap;
import java.util.Map;

import com.ibm.collections.Book;

public class MapDemo {
	public static void main(String[] args) {
		createMapofBooks();
	}

	private static void createMapofBooks() {
		Map<String, Book> books = new HashMap<String, Book>();
		System.out.println(books.size());
		Book book1 = new Book("Java");
		books.put("book1", book1); // "book1" is key for book
		System.out.println(books.size());
		for (int i = 0; i < 10; i++) {
			Book book = new Book("Title" + i);
			book.setPrice(100 * i);
			book.setPublishYear(2000 + i);
			books.put("book" + i, book);
		}
		// books.clear(); // to clear all key-value pairs
		// books.remove(book5); to remove a key from the map
		System.out.println(books.size());
		// System.out.println(books);
	}
}
