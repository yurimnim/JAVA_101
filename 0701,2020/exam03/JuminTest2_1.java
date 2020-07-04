package com.bit.exam03;
import java.util.Scanner;

class Jumin {
	public static boolean checkJimin(String jumin) {
		boolean r = false;
		int arr[] = {2,3,4,5,6,7,1,8,9,2,3,4,5};  
		int sum = 0;
		
		for(int i=0; i<jumin.length()-1;i++) {
			if(jumin.charAt(i) != '-') {
			int n = Integer.parseInt(jumin.charAt(i)+""); 
			sum = sum + n * arr[i];
			}
		}  
	   
		sum = sum % 11;
		sum = 11 - sum;
		if(sum == 10) {
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

	public static boolean checkJumin(String jumin) {
		// TODO Auto-generated method stub
		return false;
	}	
	}


public class JuminTest2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String jumin;
		
		System.out.println("주민번호를 입력하세요.");
		jumin = scan.next();
		
		if(Jumin.checkJumin(jumin)) {
			System.out.println("올바른 주민번호 입니다.");
		}else {
			System.out.println("올바른 주민번호가 아닙니다.");
		}
	}
}
		

