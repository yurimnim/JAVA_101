package com.bit.rps;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class GameTest {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(0, "����");
		map.put(1, "����");
		map.put(2, "��");
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int com = r.nextInt(3);
		
		System.out.print("�ϳ��� �����Ͻÿ�. 0.���� 1.���� 2.�� ==>");
		int user = sc.nextInt();
		
		
		System.out.println("��ǻ�ʹ� " + map.get(com) + "�� �½��ϴ�");
		System.out.println("���� " + map.get(user) + "�� �½��ϴ�");
		
		//����,���� �̰�� --�̰� ������ ������� �ڵ尡 ª���� 
		
		if(com==user) {
			System.out.println("����!");
		}else if((user==0 && com==2) && (user==1 && com==0) && (user==2 && com==1)) {
			System.out.println("�̰��!");
		}else {
			System.out.println("����");
		}
	}
}
