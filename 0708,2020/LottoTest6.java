package com.bit.exam04;

import java.util.Random;
import java.util.TreeSet;

//set�� �̿��Ͽ� �ζǻ����⸦ ����� ���ϴ�.
public class LottoTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//7,11,12,31,33,38
		TreeSet<Integer> set = new TreeSet<Integer> ();
		set.add(7);
		set.add(11);
		set.add(12);
		set.add(31);
		set.add(33);
		set.add(38);
		Random r = new Random();
		long i =1;
		while(true) {
			TreeSet<Integer>   s = new TreeSet<Integer> ();
			while(true) {
				s.add(r.nextInt(45)+1);
				if(s.size() == 6)
					break;
			}
			if(set.equals(s))
			{
				break;
			}
//			if(i % 100 == 0)
//				System.out.println(i+"��° ����");
			i++;
		}
		System.out.println(i+"��° ����");
		System.out.println(i*1000);
	}
}
