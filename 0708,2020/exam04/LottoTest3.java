package com.bit.exam04;
//set�� �̿��Ͽ� �ζǻ����⸦ ����� ����. 
//����ڿ��� �ݾ��� �Է¹޾Ƽ� �ζǴ� 1�忡 õ��
//�� �ݾ׸�ŭ �ζǹ�ȣ�� �����غ���

import java.util.Random;
import java.util.TreeSet;

public class LottoTest3 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		TreeSet lucky = new TreeSet();
		lucky.add(7);
		lucky.add(11);
		lucky.add(12);
		lucky.add(31);
		lucky.add(33);
		lucky.add(38);
		
		int cnt = 0;
		
		while(true) {
				TreeSet set = new TreeSet();
				Random r = new Random();	
					while(true) {
						set.add(r.nextInt(45) + 1);
						if(set.size() == 6) {
							break;
					}	
				} if (!set.equals(lucky)) {
					cnt++;
				} else if (set.equals(lucky)) {
					break;
				}
			}
		System.out.println("���� " + cnt*1000 + " �� ��ġ �����ϼ���");
	}
}
