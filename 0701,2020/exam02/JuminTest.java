package com.bit.exam02;

import java.util.Scanner;

public class JuminTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String jumin;
	
		System.out.println("�ֹι�ȣ�� �Է��Ͻÿ�.:");
		jumin = sc.next();
				
		
//		�� = 11-{(2����+3����+4����+5����+6����+7����+8����+9����   +2����+3����+4����+5����) mod 11}
		//�迭���
		int []arr = {2,3,4,5,6,7,1,8,9,2,3,4,5};
		
		int sum = 0;
		
		for(int i=0; i < jumin.length()-1; i++) {
			if(jumin.charAt(i) !='-') {
				int n = Integer.parseInt(jumin.charAt(i) + "");
				sum = sum + n*arr[i];
			}
		}
		
		sum = sum % 11; 
		sum = 11 - sum;
		if(sum == 10) {
			sum = 0;
		}
		if (sum == 11) {
			sum = 1;
		}
		
		int check = Integer.parseInt(jumin.charAt(jumin.length()-1) + "");
		
		if (sum == check) {
			System.out.println("�ùٸ� �ֹι�ȣ �Դϴ�.");
		} else {
			System.out.println("�ùٸ� �ֹι�ȣ�� �ƴմϴ�.");
		}
	}

}
