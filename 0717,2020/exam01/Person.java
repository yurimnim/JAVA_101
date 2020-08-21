package com.bit.exam01;

public class Person extends Thread {
	String name;
	Account account;
	
	public Person(String name, Account account) {
		this.name = name;
		this.account = account;
	}
	
	public void run() {
		for(int i=1; i <=3; i++) {
			account.deposit(1000);
			System.out.println(name + "가 " + i + "번째 전화를 걸었다. ");
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				
			}
		}
		
	}
}
