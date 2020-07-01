package com.bit.exam05;

public class MyUtil {
	
	public double max(double []arr) {
		double r = arr[0];
		for(int i=1; i < arr.length; i++) {
			if(arr[i] > r) {
				r = arr[i];
			}
	 }
		return r;
	}
	
	public double max(double a,double b) {
		double r = a;
		if(b > r)
			r = b;
		return r;
	}
	
	public int max(int a,int b) {
		int r = a;
		if(b>r)
			r = b;
		return r;
	}

}
