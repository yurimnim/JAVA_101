package com.bit.exam05;

public class StringTest {
	public static void main(String[] args) {
		String s = new String("java"); // �̰��̿�Ģ
		String s2 = "java";
		String s3 = "java";
		String s4 = new String("java"); //���� ����� ���� �޸� ������� �ٸ�
		
		if(s.equals("java")) {
			System.out.println("���ƿ�");
		}else {
			System.out.println("�޶��");
		}
		
		/*
		if(s2==s3) {
			System.out.println("same");
		}else {
			System.out.println("different");
		}
		*/
		
		/*
		System.out.println(s);
		System.out.println(s2);
		*/
		
		/*
		if (s==s4) {
			System.out.println("same");
		}else {
			System.out.println("different");
		}
		*/
 }
}
