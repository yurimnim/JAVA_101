package com.bit.exam06;

public class Test {
	
	public static void hello() {
		System.out.println("¾È³çÇÏ¼¼¿ä");
	}
	
	public static String getName() {
		hello();
		return "È«±æµ¿";
	}
	
	public static void main(String[] args) {
		System.out.println(getName());
	}

}
