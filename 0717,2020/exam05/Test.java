package com.bit.exam05;

public class Test {
	public static void main(String[] args) {  
	   ThreadTestA a = new ThreadTestA();
	   ThreadTestB b = new ThreadTestB();
	   ThreadTestC c = new ThreadTestC();
	   
	   a.start();
	   b.start();
	   c.start();
	}
}
