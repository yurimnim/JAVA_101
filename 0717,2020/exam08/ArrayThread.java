package com.bit.exam08;

public class ArrayThread extends Thread{
	SumArr sumArr;
	int[] arr;
	
	public ArrayThread(SumArr sumArr, int[] arr) {
		this.sumArr = sumArr;
		this.arr = arr;
	}
	
	public void run() {
		for(int n:arr) {
			sumArr.add(n);
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				
			}
		}
	}
}
