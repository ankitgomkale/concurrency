package com.ankitgomkale.racecondition;

public class TestRaceCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAccount myAccount = new MyAccount();
		myAccount.setBalance(100);
		
		Thread john = new Thread(myAccount);
		Thread anita = new Thread(myAccount);
		
		john.setName("John");
		anita.setName("Anita");
		
		john.run();
		anita.run();
	}

}
