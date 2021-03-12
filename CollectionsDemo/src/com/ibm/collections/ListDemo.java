package com.ibm.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		demo();
		bookList();
	}

	private static void bookList() {
		List<Book> books = new ArrayList<Book>();
		Book book1 = new Book("learn java");
		books.add(book1);
		book1.setPrice(100.5f);
		book1.setPublishYear(2021);
		Book book2 = new Book("teach java");
		book2.setPrice(20.0f);
		book2.setPublishYear(2020);
		books.add(book2);
		// books.add(new Book("Gita"));
		// books.add(new Book("Upanishads"));
		System.out.println(books);
		/*
		 * Iterator<Book>it = books.iterator(); while(it.hasNext()) { Book book =
		 * it.next(); if(book.getTitle().contains("G")) { System.out.println(book); } }
		 */   
		//sorting?? Sort in Ascending order
		books.sort(new Comparator<Book>(){
			public int compare(Book book1 , Book book2 ) {
				return (int)(book1.getPublishYear()-book2.getPublishYear());
			}
		});
		System.out.println("after sorting" + books);
			

	}

	private static void demo() {
		List<Integer> list = new ArrayList<Integer>(); // ArrayList is a class
		list.add(1);
		list.add(2);

		System.out.println(list);
		list.remove(1); // removes 2nd element
		System.out.println(list);
		System.out.println(list.contains(1)); // check whether it contains 1

		for (Iterator iterator = (Iterator) list.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}

	}

}
