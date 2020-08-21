package com.bit.exam09;

import java.util.Arrays;
import java.util.Random;

public class Test {
	public static void main(String[] args) {
		Random r = new Random();
		int []arr = new int[100];		
		for (int i = 0; i < 100; i++) {
			arr[i] = r.nextInt(100);
		}
		MaxArr maxArr = new MaxArr();
		int []arr1 = Arrays.copyOf(arr, 50);
		int []arr2 = Arrays.copyOfRange(arr, 50, 100);
		
		ArrayThread t1 = new ArrayThread(maxArr, arr1);
		ArrayThread t2 = new ArrayThread(maxArr, arr2);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			
		}		
		System.out.println("가장 큰 수는:" + maxArr.max);	
	}	
}
