package org.arrays;

public class Varagsdemo {
	public static void main(String[] args) {

		int result = add("ram", 1, 2, 3, 4, 5, 6, 7);
		System.out.println(result);

	}
	//static method always calls another static method
	static int add(String name ,int... numbers) {  //varargs, always at the end of the parameters
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		return sum;
	}

}

class Book {
	Author[] authors;
	private String genre;

	public Book() {
		authors = new Author[3]; // lazy initialisation
	}

	class Author {
		private String name;
		private String email;
	}
}
