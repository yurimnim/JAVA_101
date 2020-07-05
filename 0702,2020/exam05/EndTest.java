package com.bit.exam05;

public class EndTest {
	
	public static boolean validEmail(String email) {
		boolean r = false;
		String [] arr = {".co.kr", ".go.kr", ".or.kr", ".net", ".com", ".edu"};
		
		for(String a: arr) {
			if(email.endsWith(a)) {
				r = true;
				break;
			}
		}	
		return r;
	}
	
	public static void main(String[] args) {
		String email = "tiger@naver.kk";
		System.out.println(validEmail(email));
	}

	}
	
