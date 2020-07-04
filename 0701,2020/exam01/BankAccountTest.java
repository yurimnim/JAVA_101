package com.bit.exam01;

class BankAccount {
	double balance;
	
	//method
	public void addInterest() {
		balance = balance + (balance * 0.075);
	}
	
	public void printBalance() {
		System.out.println("«ˆ¿Á¿‹æ◊:: " + balance);
	}
	
	public void deposit(int amount) {
		balance = balance + amount;
	}
	
	public void withdraw(int amount) {
		if(amount > balance) {
			System.out.println("¿‹æ◊∫Œ¡∑:: ¿Œ√‚∫“∞°");
			 return;
		}
		balance = balance - amount;
	}
	
	public int getBalance() {
		return (int) balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public static void main(String[] args) {
		System.out.println("hi!");
		
	}
		
}

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount a1 = new BankAccount();
		BankAccount a2 = new BankAccount();
		
		a1.setBalance(100);
		a2.setBalance(50);
		
		a1.withdraw(60);
		a2.withdraw(70);
		
		//System.out.println("a1¿« ¿‹æ◊:" + a1.getBalance());
		//System.out.println("a2¿« ¿‹æ◊:" + a2.getBalance());

		//a1.printBalance();
		//a2.printBalance();
		
		a1.addInterest();
		a2.addInterest();
		
		a1.printBalance();
		a2.printBalance();
		
	}

}
