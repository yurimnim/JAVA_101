package com.bit.exam07;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class RsPaper {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		HashMap<Integer, String> rsp = new HashMap<Integer,String>();
		rsp.put(0, "����");
		rsp.put(1, "����");
		rsp.put(2, "��");
		
		System.out.println("0:����,1:����,2:��-���� �� �ϳ��� �Է��Ͻÿ�");
		int input = sc.nextInt();
		
		String value = rsp.get(rand.nextInt(3));
		
		System.out.println("��ǻ�ʹ� " + value + " �� �½��ϴ�.");
		
		if(value.equals("����")) {
			switch(input) {
				case 0:System.out.println("�����ϴ�");break;
				case 1:System.out.println("�̰��!");break;
				case 2:System.out.println("����");break;
			}		
		} else if (value.equals("����")) {
			switch(input) {
			case 0:System.out.println("�̰��!");break;
			case 1:System.out.println("����");break;
			case 2:System.out.println("����");break;
			}
		} else {
			switch(input) {
			case 0:System.out.println("!");break;
			case 1:System.out.println("����");break;
			case 2:System.out.println("����");break;
			}
		}

	}

}
