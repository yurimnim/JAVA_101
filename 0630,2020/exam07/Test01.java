package com.bit.exam07;

class A{
	int i;
	int j;
	static int k;
	
	public void info( ) {
		
	}
	
	public static void pro() {
		
	}
}

public class Test01 {	
	public static void main(String[] args) {
		A.k =2; //��ü�� �����ϰ� ����
		A.pro();//��ü�� �����ϰ� �����ϴ� �޼ҵ� 
	}
}
