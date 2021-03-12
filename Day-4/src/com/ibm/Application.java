package com.ibm;            // OBJECT CLASS

public class Application {
public static void main(String[] args) {
	Book book = new Book();
	try {
		book.setTitle("java");
	}catch(IllegalArgumentException illegalArgumentException) {
		
	}
	catch (Exception e) { //or can be MyEcxeption e )
		e.printStackTrace();
	}finally {
		System.out.println("Always!");
	}
	System.out.println(book.toString());
	//Book book1 = new Book();
	//book1.setTitile("CAT Prep");
	//System.out.println(book1.toString());
	
}
}
class Book{
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws MyException {
		if(title == null) {
		//	throw new IllegalArgumentException();  -->unchecked runtime exception, need not be handled.
			throw new MyException("title is absent"); // checked Exception, needs to be handled by try catch block at the place of call.
		}
		this.title = title;
	}
	public String toString() {
		return this.title;
	}
}
