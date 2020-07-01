package com.bit.exam05;

public class MyUtilTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] arr = {5.7 , 8.9, 10.6, 2.7};
		
		MyUtil util = new MyUtil();
		System.out.println("큰수는: " + util.max(2, 3));
		System.out.println("큰수는: " + util.max(2.7, 3.5));
		System.out.println("큰수는: " + util.max(arr));
	}

}
