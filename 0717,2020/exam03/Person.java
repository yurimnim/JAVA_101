package com.bit.exam03;

public class Person extends Thread {
	String name;
	Account account;
	
	public Person(String name, Account account) {
		this.name = name;
		this.account = account;
	}
	
	public void run() {
		for(int i = 1; i <= 3; i++) {
			
			account.deposit(1000);
			System.out.println(name + "가(이)" + i + "번째 전화걸었어요.");
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
}
