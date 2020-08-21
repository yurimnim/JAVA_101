package com.bit.exam02;

public class Account {
	int balance;
		
	public int getBalance() {
		return balance;
	}

	public synchronized void deposit(int amount) {
		balance += amount;
	}

}
