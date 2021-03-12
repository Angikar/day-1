package com.ibm.thread;

public class Application {
	public static void main(String[] args) {
		
		Thread t1 = new Worker();
		//t1.start();
		//Thread t2 = new Thread(new AnotherWorker());//preferrable
		//t2.start();
		t1.run();
		
		System.out.println("In the main thread");
	}
}
