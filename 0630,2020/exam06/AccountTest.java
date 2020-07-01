package com.bit.exam06;

class Account {
	private int balance;
	
	public Account() {
		balance = 0;
		System.out.println("���ο� ���°� ����������ϴ�.");
	}
	
	public void deposit(int amount){
		balance += amount;
		System.out.println(amount + "�� ����");
	}
	
	public void withdraw(int amount) { 
		balance -= amount;
		System.out.println(amount + "�� ����");
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
		 
		 System.out.println("��#1�����ܰ�::" + a1.getBalance());
		 System.out.println("��#2�����ܰ�::" + a2.getBalance());
	}
}
