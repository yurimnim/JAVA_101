package com.bit.exam01;

public class Melon extends Food {
	protected String made;

	public Melon(String made) {
		this.made = made;
	}

	public Melon(int cal, int price, int g, String made) {
		super(cal, price, g);
		this.made = made;
	}

	public String getMade() {
		return made;
	}

	public void setMade(String made) {
		this.made = made;
	}
	
	
}
