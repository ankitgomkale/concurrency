package com.ankitgomkale.firstthread;

public class MyTask implements Runnable {

	@Override
	public void run() {
		System.out.println("Inside the run method...");
		go();
	}
	
	private void go() {
		System.out.println("Inside the go method...");
	}

}
