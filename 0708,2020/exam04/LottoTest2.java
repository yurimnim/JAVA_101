package com.bit.exam04;
//set�� �̿��Ͽ� �ζǻ����⸦ ����� ����. 
//����ڿ��� �ݾ��� �Է¹޾Ƽ� �ζǴ� 1�忡 õ��
//�� �ݾ׸�ŭ �ζǹ�ȣ�� �����غ���
import java.util.Random;
import java.util.TreeSet;
import java.util.Scanner;

public class LottoTest2 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ζǸ� ������ �ݾ��� �Է��Ͻÿ�.(õ������)");
		int price = sc.nextInt();
		price = price/1000;
		System.out.println("�ζǸ� " + price + " �� �����ϼ̽��ϴ�.");
		TreeSet set[] = new TreeSet[price];
		
			for(int i = 1; i <= price; i++) {	
				set[i] = new TreeSet();
				Random r = new Random();	
					while(true) {
						set[i].add(r.nextInt(45) + 1);
						if(set[i].size() == 6) {
							break;
						}	
					}
				System.out.println(set[i]);	
			}		
	}

}
