package com.bit.exam05;

import java.util.Scanner;

public class JoinTest {
	
	public static boolean validId(String id) {
		id = id.toLowerCase();
		boolean re = false;
		if(id.length()>=6 && id.length() <= 12 && id.charAt(0) >= 'a' && id.charAt(0) <= 'z' )
			re = true;
		return re;
	}
	
	public static boolean hasSpecial(String pwd) {
		char []arr = {'!','@','#','$','%','^','&','*','(',')','-','+','=',
				',','.',':',';','"','\'','/','\\','|','?'};
		boolean re = false;
		for(int i=0; i<pwd.length(); i++) {
			for(char c:arr) {
				if(pwd.charAt(i) == c) {
					return true;
				}
			}
		}
		return re;
	}
	
	public static boolean hasEng(String pwd) {
		boolean re = false;
		pwd  = pwd.toLowerCase();
		for(int i=0; i<pwd.length(); i++) {
			if(pwd.charAt(i) >= 'a' && pwd.charAt(i) <= 'z') {
				return true;
			}
		}
		return re;
	}
	
	public static boolean hasDigit(String pwd) {
		boolean re = false;
		pwd  = pwd.toLowerCase();
		for(int i=0; i<pwd.length(); i++) {
			if(pwd.charAt(i) >= '0' && pwd.charAt(i) <= '9') {
				return true;
			}
		}
		return re;
	}
	
	
	public static boolean validPwd(String pwd) {
		boolean re = false;
		if(hasSpecial(pwd) && hasEng(pwd) && hasDigit(pwd) 
				&& pwd.length() >= 6) {
			re = true;
		}
		return re;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String id, pwd,chPwd;
		
		System.out.print("아이디를 입력하세요==>");
		id = sc.next();
		
		System.out.print("암호를 입력하세요==>");
		pwd = sc.next();
		
		System.out.print("암호확인을  입력하세요==>");
		chPwd = sc.next();
		
		boolean re = false;
		
		re = validId(id) && validPwd(chPwd) && pwd.equals(chPwd);
		
		if(re ) {
			System.out.println("바람직한 입력값입니다.");
		}else {
			System.out.println("바람직한 입력값이 아닙니다.");
		}
			
	}	

}