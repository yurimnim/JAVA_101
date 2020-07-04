package com.bit.exam06;

public class EqualsTest {
	public static void main(String[] args) {
		String data = "tiger";
		String data2 = "Tiger";
		
		if(data.equalsIgnoreCase(data2)) {
			System.out.println("같아요");
		}else {
			System.out.println("different");
		}
		
		/*
		if(data.equals(data2)) {
			System.out.println("같아요");
		}else {
			System.out.println("different");
		}
		*/
	}
}
