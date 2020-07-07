package com.bit.exam01;

public class Food {
	protected int cal;
	protected int price;
	protected int g;
	
	
	public Food(int cal, int price, int g) {
		
		this.cal = cal;
		this.price = price;
		this.g = g;
	}
	

	public Food() {
		
	}


	public int getCal() {
		return cal;
	}
	
	public void setCal(int cal) {
		this.cal = cal;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getG() {
		return g;
	}
	public void setG(int g) {
		this.g = g;
	}
	
}
