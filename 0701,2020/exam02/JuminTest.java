package com.bit.exam02;

import java.util.Scanner;

public class JuminTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String jumin;
	
		System.out.println("주민번호를 입력하시오.:");
		jumin = sc.next();
				
		
//		ㅍ = 11-{(2×ㄱ+3×ㄴ+4×ㄷ+5×ㄹ+6×ㅁ+7×ㅂ+8×ㅅ+9×ㅇ   +2×ㅈ+3×ㅊ+4×ㅋ+5×ㅌ) mod 11}
		//배열사용
		int []arr = {2,3,4,5,6,7,1,8,9,2,3,4,5};
		
		int sum = 0;
		
		for(int i=0; i < jumin.length()-1; i++) {
			if(jumin.charAt(i) !='-') {
				int n = Integer.parseInt(jumin.charAt(i) + "");
				sum = sum + n*arr[i];
			}
		}
		
		sum = sum % 11; 
		sum = 11 - sum;
		if(sum == 10) {
			sum = 0;
		}
		if (sum == 11) {
			sum = 1;
		}
		
		int check = Integer.parseInt(jumin.charAt(jumin.length()-1) + "");
		
		if (sum == check) {
			System.out.println("올바른 주민번호 입니다.");
		} else {
			System.out.println("올바른 주민번호가 아닙니다.");
		}
	}

}
