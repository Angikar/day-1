package com.ibm.Excep;

public class ExceptionPropagation {
	public static void main(String[] args) {
		new A().m1();  //calling m1(), but exception occurs at m2()
	}
}

class A{
	void m1() {
		//m2();
		try {
			m2(); //now exception is handled
		}catch( RuntimeException run) {
			run.printStackTrace(); //now it will print all 3
			System.out.println("handled");
		}catch( Exception exception) { //now handled will not beprinted
			System.out.println("caught");
		}finally {
			System.out.println("Always printed");
		}
		System.out.println("m1");
		//m2();
	}
	void m2() throws Exception {
		System.out.println("m2");
		//throw new RuntimeException();  
		throw new Exception();
	}
}
