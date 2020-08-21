package com.bit.exam10;

public class Person extends Thread {
	private String name;
	private int cnt;
	Bus bus;
	
	public Person(String name, int cnt, Bus bus) {
		this.name = name;
		this.cnt = cnt;
		this.bus = bus;
	}
	
	public void run() {
		
		bus.Reservation(name, cnt);
		
	}
}
