package com.ibm.collections;

//import com.ibm.MyException;

public class Book {
	private String title;
	private float price;
	private int publishYear;
	
	

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Book(String string) {
		this.title = string;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String toString() {
		return "{title: " + this.title + ", price: " + this.price + ", Year: " + this.publishYear+"}";
	}
}