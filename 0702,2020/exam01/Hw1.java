package com.bit.exam01;

import java.util.Scanner;

public class Hw1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ùٸ� �̸���oooo@oooo.ooo 
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸����� �Է��ϼ���");
		String email;
		email = sc.next();
		boolean f = email.contains("@");
		boolean t = email.contains(".");
		if (f == true && t == true) {
			System.out.println(email);
		}else {
			System.out.println("�߸��� �̸����� �Է��ϼ̽��ϴ�");
			return;
		}
	}
}
