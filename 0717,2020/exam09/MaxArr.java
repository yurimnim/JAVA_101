package com.bit.exam09;

public class MaxArr {
	int max=0;
	
	public synchronized void isMax(int n) {
		if(n > max) {
			max = n;
		}
		System.out.println(n+ " 과 비교하여 큰 값은 " + max);
		
	}
}
