package com.bit.exam05;

public class CallByValueTest {
	//������ ���� n�� �Ű������� ���޹޾� 1�����ϴ� �޼ҵ�
	public static void plusOne(int n) {
		n = n+1;
		System.out.println("n: " + n);
	} 
	
	public static void main(String[] args) {
		int age = 20;
		
		plusOne(age);
		System.out.println(age);
	}
}
