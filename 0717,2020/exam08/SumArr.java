package com.bit.exam08;

public class SumArr {
	int tot = 0;
	
	public synchronized void add(int amount) {
		System.out.println(amount + " �� ���ߴ�: " + tot);
		tot += amount;
	}
}
