package com.bit.exam02;

public class Person extends Thread {
	String name;
	Account account;
	
	public Person(String name, Account account) {
		this.name = name;
		this.account = account;
	}
		
	public void run() {
		for(int i =1;;i++){
			if(account.getBalance() >= 500000) {
				break;
			}
			account.deposit(1000);
			System.out.println(name + " ��(��) " + i + " ��° ��ȭ�� �ɾ���. ");
			try {
				Thread.sleep(30);
			} catch (Exception e) {
				
			}			
		}		
	}
}
