package com.bit.exam09;

public class ArrayThread extends Thread{
	MaxArr maxArr;
	int[] arr;
	
	public ArrayThread(MaxArr maxArr, int[] arr) {
		this.maxArr = maxArr;
		this.arr = arr;
	}
	
	public void run() {
		for(int n:arr) {
			maxArr.isMax(n);
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				
			}
		}
	}
}
