package com.bit.exam02;

import java.util.Scanner;

class Jumin{
	public static boolean checkJumin(String jumin) {
		boolean r = false;
		int arr[] = {2,3,4,5,6,7,1,8,9,2,3,4,5};
		int sum = 0;
		
		for(int i=0;i<jumin.length()-1;i++) {
			if(jumin.charAt(i) != '-') {
				int n = Integer.parseInt(  String.valueOf( jumin.charAt(i)) );
				sum = sum + n * arr[i];
			}
		}
		
		sum = sum % 11;
		sum = 11-sum;
		if(sum == 10){
			sum = 0;
		}
		
		if(sum == 11) {
			sum = 1;
		}
		
		int check = Integer.parseInt(jumin.charAt(jumin.length()-1)+"");
		if(sum == check) {
			r = true;
		}else {
			r = false;
		}
		
		return r;
	}
}



//메소스를 이용한 것으로 변환 해 봅니다.
public class JuminTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String jumin;
		System.out.println("주민번호를 입력하세요==>");
		jumin = sc.next();
		if(Jumin.checkJumin(jumin)) {
			System.out.println("올바른 주민번호입니다.");
		}else {
			System.out.println("올바른 주민번호가 아닙니다.");
		}
		
	}
}