package com.bit.exam04;
//set을 이용하여 로또생성기를 만들어 보자. 
//사용자에게 금액을 입력받아서 로또는 1장에 천원
//그 금액만큼 로또번호를 생성해보자

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
		System.out.println("복권 " + cnt*1000 + " 원 어치 구입하세요");
	}
}
