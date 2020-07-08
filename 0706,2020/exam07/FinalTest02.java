package com.bit.exam07;

class Bit {
	public final void hello() { //No overriding!
		System.out.println("hello");
	}
	
	public void pro() {
		System.out.println("pro");
	}
}

class Bitcamp extends Bit {
	public void pro() {
		System.out.println("yes");
	}
	
//	public void hello() {
//		System.out.println("No");
//	} //¿Ã∞« æ»µ 
}

public class FinalTest02 {
	public static void main(String[] args) {


	}

}
