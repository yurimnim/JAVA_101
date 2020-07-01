package com.bit.exam06;

class Account {
	private int balance;
	
	public Account() {
		balance = 0;
		System.out.println("새로운 계좌가 만들어졌습니다.");
	}
	
	public void deposit(int amount){
		balance += amount;
		System.out.println(amount + "원 저축");
	}
	
	public void withdraw(int amount) { 
		balance -= amount;
		System.out.println(amount + "원 인출");
	}

	public int getBalance() {
		return balance;
	}
	
}

public class AccountTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Account a1 = new Account();
		 a1.deposit(50000);
		 Account a2 = new Account();
		 a2.deposit(100000);
		 
		 System.out.println("고객#1계좌잔고::" + a1.getBalance());
		 System.out.println("고객#2계좌잔고::" + a2.getBalance());
	}
}
