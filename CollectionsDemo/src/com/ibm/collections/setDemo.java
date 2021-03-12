package com.ibm.collections;
import java.util.HashSet;
import java.util.Set;
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
		}
		System.out.println(books);
	}	
}
