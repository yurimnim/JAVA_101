package com.bit.exam04;
//�ֹι�ȣ�� �Է¹޾� ���̿� ������ �Ǵ��Ͽ� ����ϴ� ���α׷��� �ۼ� 

import java.util.Date;
import java.util.Scanner;

public class StringTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String juminNo;
		System.out.print("�ֹε�Ϲ�ȣ�� �ۼ��Ͻÿ�==>");
		juminNo = sc.next();
		
		//���� ���
		Date today = new Date();
		int year = today.getYear();
				
		//�ֹι�ȣ ����
		int check= Integer.parseInt(juminNo.substring(7,8));		
		int checkyr = Integer.parseInt(juminNo.substring(0, 2));

	
		//���̰�� üũ 
		if(check == 3 || check == 4 || check==7 || check ==8) {
			year = year - 100;
		}
		
		//�����Ǻ�
		if(check == 1 ||check == 3 || check == 5 || check == 7) {
			System.out.println("����: ��");
		}else {
			System.out.println("����: �� ");
		}
		
		int age = year - checkyr + 1;
		System.out.println("���س���:" + age);
				
	}

}
