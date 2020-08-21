package com.bit.exam08;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int []arr = new int[100];		
		for (int i = 0; i < 100; i++) {
			arr[i] = i;
		}
		SumArr sumArr = new SumArr();
		int []arr1 = Arrays.copyOf(arr, 50);
		int []arr2 = Arrays.copyOfRange(arr, 50, 100);
		
		ArrayThread t1 = new ArrayThread(sumArr, arr1);
		ArrayThread t2 = new ArrayThread(sumArr, arr2);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			
		}
		
		System.out.println("¹è¿­ÀÇ ÃÑÇÕ:" + sumArr.tot);
		
	}	
}
