package com.bit.exam01;

public class Account {
	int balance;
		
	public int getBalance() {
		return balance;
	}

	public synchronized void deposit(int amount) {
		balance += amount;
	}

}
