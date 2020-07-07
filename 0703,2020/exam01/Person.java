package com.bit.exam01;

public class Person {
	protected String name;
	protected String address;
	protected String phon;
	
	public Person() {
		name = "java";
		address = "bit";
		phon = "010-2033-1234";
	}
	
	public Person(String name, String address, String phon) {
		this.name = name;
		this.address = address;
		this.phon = phon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhon() {
		return phon;
	}

	public void setPhon(String phon) {
		this.phon = phon;
	}
	
}

