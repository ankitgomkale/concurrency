package com.ankitgomkale.racecondition;

public class MyAccount implements Runnable {
	private int balance;
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	@Override
	public void run() {
		makeWithdrawal(75);
		if (balance < 0) {
			System.out.println("Money overdrawn!!!");
		}
	}
	
	private void makeWithdrawal(int amount) {
		if (balance >= amount) {
			System.out.println(Thread.currentThread().getName() + " is about to withdraw ...");
			balance -= amount;
			System.out.println(Thread.currentThread().getName() + " has withdrawn " + amount + " bucks");
	    } else {
	    	System.out.println("Sorry, not enough balance for " + Thread.currentThread().getName());
	    }
	}
}
