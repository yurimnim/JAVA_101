package com.bit.exam05;

public class StringTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "The cat is on the table.";
		int index = s.indexOf("table");
		System.out.println(index);
		if(index == -1){
			System.out.println("java�� �����ϴ�.");
			}
		else {
			System.out.println("java�� �ֽ��ϴ�.");
		}
 }
}
