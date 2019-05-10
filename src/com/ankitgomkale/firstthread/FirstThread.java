package com.ankitgomkale.firstthread;

public class FirstThread {

	public static void main(String[] args) {
		//Creating a task
		Runnable task = new MyTask();
		
		//Creating a thread which will run the task created above
		Thread thread = new Thread(task);	//Thread will be in NEW state at this point
		thread.start();		//nothing happens until we invoke start method
		
		System.out.println("Inside the main method...");	//Observe the async behavior here
		
		//What will happen if we start the thread again?
		//thread.start();
	}

}
