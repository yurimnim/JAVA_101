package com.bit.exam06;

import java.util.Scanner;

public class UpperCaseTest {
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		
		String myWord;
		System.out.println("���� ���ڿ��� �Է��Ͻÿ�");
		myWord = sc.nextLine();
		
		int count = 0;
		
		for(int i = 0; i < myWord.length(); i++) {
			if(myWord.charAt(i) >= 'A' && myWord.charAt(i) <= 'Z') {
				count++;
			}
		}
		
		System.out.println("�빮�� ����:: " + count + "��");
	}
}
