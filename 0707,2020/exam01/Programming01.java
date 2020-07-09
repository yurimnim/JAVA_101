package com.bit.exam01;
interface Buyable{
	
	public int getPrice();
}

class Television implements Buyable{
	String model;
	String maker;
	int price;
	public Television(String model, String maker, int price) {
		super();
		this.model = model;
		this.maker = maker;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Television [model=" + getModel() + ", maker=" + getMaker() + ", price=" + getPrice()+"]"; 
				
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public String getMaker() {
		return maker;
	}



	public void setMaker(String maker) {
		this.maker = maker;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public int getPrice() {
		return price;
	}
}

class Refregerator implements Buyable {
	
	private String model;
	private String maker;
	private int price;

	public Refregerator(String model, String maker, int price) {
		super();
		this.model = model;
		this.maker = maker;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Refregerator [model=" + model + ", maker=" + maker + ", price=" + price + "]";
	}

	
}


public class Programming01 {
	
	public static void printPrice(Buyable item) {
		System.out.printf("%10d¿‘¥œ¥Ÿ.\n",item.getPrice());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyable item = new Television("LG-440", "LG", 124124124);
		System.out.println(item);
		
		Buyable item2 = new Refregerator("µı√º", "lg", 90000);
		System.out.println(item2);
		printPrice(item);
		printPrice(item2);
		
	}

}
