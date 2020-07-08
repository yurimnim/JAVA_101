package com.bit.exam07;

class A {
	int i;
	final static int j= 100;
}

public class FinalTest01 {
	public static void main(String[] args) {
		A ob1 = new A();
		A ob2 = new A();
		
		ob1.i = 200;
		ob2.i = 300;
		ob2.i = 4300;


	}

}
