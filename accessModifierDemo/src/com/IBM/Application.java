package com.IBM;

public class Application {
	public static void main(String[] args) {
		
		B b = new B();
		//B b = new A(); // subclass 
		//A b = new B();
		// A b = new A();
		
		System.out.println(b.age);
		b.m1();
	}
}
