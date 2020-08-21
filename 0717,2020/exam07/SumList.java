package com.bit.exam07;

import java.util.ArrayList;

class SumList_demo {
	ArrayList<Integer> arr;
	int sum = 0;
	boolean isNew;
		
	public SumList_demo(ArrayList<Integer> arr) {
		this.arr = arr;
	}
	
	public synchronized int getSum() {
		while(isNew == false) {
			try {
				wait();
			}catch (Exception e) {

			}
		}
		for(int i=0; i<arr.size(); i++) {
			sum = sum + arr.get(i);
		}
		isNew = true;
		notify();
		return sum;
	}
}

public class SumList {	
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> b1 = new ArrayList<Integer>();
		
		for(int i=1; i<50; i++) {
			a1.add(i);
		}
		
		for(int i=49; i<100; i++) {
			b1.add(i);
		}
			

 }
}	
