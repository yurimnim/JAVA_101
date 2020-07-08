package com.bit.exam09;

interface A {
	int year = 2020; //final 
	public void pro() {
		
	}
	
} //automaticaly becomes final.Not able to build bodies (such as methods)

interface B {
	public void hello() {
		
	}
}

class C implements A,B {
	String title;
		
	public void pro() {
		 
	}
	public void hello() {
		
	}
	public void info() {
		
	}


}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
