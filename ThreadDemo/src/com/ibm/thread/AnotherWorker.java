package com.ibm.thread;

public class AnotherWorker implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("In another worker thread:"+Thread.currentThread());
	}

}
