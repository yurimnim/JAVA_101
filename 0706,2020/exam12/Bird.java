package com.bit.exam12;

public abstract class Bird {
	public abstract void sound();
}

class Dove extends Bird {
	public void sound() {
		System.out.println("Coo-coo");
	}
}

