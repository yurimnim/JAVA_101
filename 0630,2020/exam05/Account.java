package com.bit.exam05;

public class Account {
	private int regNumber;
	private String name;
	private int balance;
	
	public int getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(int regNumber) {
		this.regNumber = regNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public static void main(String [] args) {
		Account obj = new Account();
		obj.setName("Tom");
		obj.setBalance(10000);
		
		System.out.println("�̸��� " + obj.getName() + " �����ܰ�� " + obj.getBalance() + " �Դϴ�.");
		
	}
	

}
