package com.bit.exam04;

import java.util.Date;
import java.util.Scanner;

/*
 ����ڿ��� �̸��� �ֹι�ȣ�� �Է¹޾� ����ϰ��� ��������� �Ǻ��ϰ�
 ����ϰ��� �׸��� ����ϴ� ���α׷� �ۼ� 
 ó������:: ����ϰ��� ����� ���� 40�� �̻� ���� Ȧ���⵵ == Ȧ���⵵��/¦���⵵�� ¦���⵵��
 ## ���� �ϰ��� ����##
 ���̰� 40�� �̻� ����: ����, ����  
 ���̰� 40�� �̻� ����: ����,����, �����, �ڱþ�
 ���̰� 50�� �̻� ����: ����, ����, �����
 ���̰� 50�� �̻� ����: ����, ����, �����, �����, �ڱþ� 
 */

public class CancerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date today = new Date();
		
		int thisYr = today.getYear() + 1900;
			
		String juminNo,name;
		
		//�Է�
		
		System.out.print("�̸��� �Է��Ͻʽÿ� ==> ");
		name = sc.next();
		System.out.print("�ֹε�Ϲ�ȣ�� �Է��Ͻʽÿ� ==>"); 
		juminNo = sc.next();
		
		
		//����,�������� 
		int gender = Integer.parseInt(juminNo.charAt(7) +"");
		int birthYr = Integer.parseInt(juminNo.substring(0, 2));
		
		
		if(gender == 3 || gender == 4 || gender == 7 || gender == 8 ) {
			birthYr = birthYr + 2000;
		}else {
			birthYr = birthYr + 1900;
		}
		
		
		int age = thisYr - birthYr + 1;
		int check = birthYr % 2;
		
		if (age < 40 || check != birthYr%2) {
			System.out.println(name +"���� ���� �ϰ��� ����ڰ� �ƴմϴ�.");
			return;
		}
		
		String r = "����, ����"; 
		
		if (age >=50) {
			r += ", �����";
		} 
		
		if (gender == 2) {
			r += ", �����, �ڱþ�";
		}
		
		System.out.println(name + " ���� ���� " + thisYr + " �⵵ ���� �ϰ��� ����� �Դϴ�. ���డ�� �˻�:" + r);
			
		/*
		if(check == thisYr % 2) {
			if (gender == 1) {
				if (age >=40 && age < 50) {
					System.out.println(name +"�� ���� �ϰ��� �����:" + age + " ��::" + "���డ�� �˻�: "+ r);
				} else if (age >=50) {
					System.out.println(name +"�� ���� �ϰ��� �����: " + age + " ��::" + "���డ�� �˻�: "+ r + "�����");
				} else {
					System.out.println(name +"���� ���� �ϰ��� ����ڰ� �ƴմϴ�");
				}
		 } else if (gender == 2)
			 if (age >=40 && age < 50) {
					System.out.println(name +"�� ���� �ϰ��� �����: " + age + " ��::" + "���డ�� �˻�: "+ r + "�����, �ڱþ�");
				} else if (age >=50) {
					System.out.println(name +"�� ���� �ϰ��� �����: " + age + " ��::" + "���డ�� �˻�: "+ r + "�����, �����, �ڱþ�");
				} else {
					System.out.println(name +"���� ���� �ϰ��� ����ڰ� �ƴմϴ�");
				}
		} else {
			System.out.println(name + "���� ���� �ϰ��� ����ڰ� �ƴմϴ�.");
		}
		*/
	}
	
	
}
