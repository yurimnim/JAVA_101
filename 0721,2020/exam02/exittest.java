package com.bit.exam02;

public class exittest {
	public static void main(String[] args) {
		String exit = "^exit";
		byte[] b = exit.getBytes();
		for(int i = 0; i<b.length;i++) {
			System.out.print(b[i] + " ");
		}
	}
}
