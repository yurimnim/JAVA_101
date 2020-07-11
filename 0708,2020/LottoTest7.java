package com.bit.exam04;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

//로또는 1장에 1000원입니다. 
//사용자 한테 금액을 입력받아 그 금액만큼 로또번호를 생성 해 봅니다.
public class LottoTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println("로또 구매금액을 입력==>");
		int money = sc.nextInt();
		int n = money/1000;
		System.out.println("로또를 " + n + "장 구매하셨습니다.");
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






