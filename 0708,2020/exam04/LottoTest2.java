package com.bit.exam04;
//set을 이용하여 로또생성기를 만들어 보자. 
//사용자에게 금액을 입력받아서 로또는 1장에 천원
//그 금액만큼 로또번호를 생성해보자
import java.util.Random;
import java.util.TreeSet;
import java.util.Scanner;

public class LottoTest2 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("로또를 구입할 금액을 입력하시오.(천원부터)");
		int price = sc.nextInt();
		price = price/1000;
		System.out.println("로또를 " + price + " 장 구매하셨습니다.");
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
