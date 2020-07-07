package com.bit.exam01;

public class Customer extends Person{
	private String cNum;
	private int mp;
	
	public Customer() {
		super();
		cNum = "010cn";
		mp = 15;
	}
	public Customer(String cNum, int mp) {
		
		this.cNum = cNum;
		this.mp = mp;
	}
	
	public Customer(String name, String address, String phon, String cNum, int mp) {
		super(name, address, phon);
		this.mp = mp;
	}
	
	public String getcNum() {
		return cNum;
	}
	public void setcNum(String cNum) {
		this.cNum = cNum;
	}
	public int getMail() {
		return mp;
	}
	public void setMail(int mail) {
		this.mp = mail;
	}
	
	public void printInfo() {
		System.out.println("이름 :" + name + ",전화번호 : " + phon + ", 고객번호 : " + cNum);
	}
		
	
}

