package com.ibm.Set;
import java.util.HashSet;
import java.util.Set;

import com.ibm.collections.Book;
public class setDemo {

	public static void main(String[] args) {
		createBookSet();
	}

	private static void createBookSet() {
		// TODO Auto-generated method stub
		Set<Book> books = new HashSet<Book>();
		// ctrl + shift + O
		for(int i = 0; i<4; i++) {
			Book book = new Book("Title" + i);
			book.setPrice(100*i);
			book.setPublishYear(2000 + i);
			books.add(book);
			books.add(book); //duplicate values are discarded 
			                 //in sets
		}
		System.out.println(books.size());
	}	
}
