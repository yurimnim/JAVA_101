package com.bit.exam06;

public class Test {
	
	public static void hello() {
		System.out.println("�ȳ��ϼ���");
	}
	
	public static String getName() {
		hello();
		return "ȫ�浿";
	}
	
	public static void main(String[] args) {
		System.out.println(getName());
	}

}
