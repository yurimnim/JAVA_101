package com.bit.exam04;
//set을 이용하여 로또생성기를 만들어 보자. 

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class LottoTest {

	public static void main(String[] args) {
		Random rand = new Random();
		
		
		HashSet lotto = new	HashSet();	
		for(int i=0; i < 7; i++) {
			lotto.add(rand.nextInt(45) + 1);
		}	
//			/*
//		
		System.out.println(lotto);
//		
//		TreeSet set = new TreeSet();
//		Random r = new Random();
//		
//		while(true) {
//			set.add(r.nextInt(45) + 1);
//			if(set.size() == 6)
//				break;
//		}
//		System.out.println(set);
		
	}

}
