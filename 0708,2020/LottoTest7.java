package com.bit.exam04;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

//�ζǴ� 1�忡 1000���Դϴ�. 
//����� ���� �ݾ��� �Է¹޾� �� �ݾ׸�ŭ �ζǹ�ȣ�� ���� �� ���ϴ�.
public class LottoTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println("�ζ� ���űݾ��� �Է�==>");
		int money = sc.nextInt();
		int n = money/1000;
		System.out.println("�ζǸ� " + n + "�� �����ϼ̽��ϴ�.");
		TreeSet set[] = new TreeSet[n];
		for(int i=0; i<n; i++) {
			set[i] = new TreeSet();
			 while(true) {
				 set[i].add(r.nextInt(45)+1);
				 if(set[i].size() == 6)
					 break;
			 }
			 System.out.println(set[i]);
		}
	}
}






