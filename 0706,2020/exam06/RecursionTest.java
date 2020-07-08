package com.bit.exam06;

public class RecursionTest {
	//임의의 변수 n을 전달받아 1에서 n까지의 합을 누적하여 반환하는 메소드 정의 
	//재귀호출이용
	public static int getSum(int n) {
		if(n == 1)
			return 1;
		return n + getSum(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println("결과: " + getSum(5));	
	}
}
