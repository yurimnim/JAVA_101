package com.bit.exam04;

import java.util.Scanner;

//����ڿ��� �̸����� �Է¹޾� ���̵� ���
public class StringTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner sc = new Scanner(System.in);
	 String email;
	 System.out.println("�̸����� �Է��Ͻÿ�");
	 email = sc.next();
	 
	 String id = email.substring(0, email.indexOf("@"));
	 System.out.println(id);
	}

}
