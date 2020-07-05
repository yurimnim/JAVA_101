package com.bit.exam03;
import java.util.Scanner;

class EmailText {
	int dotIndexFront;
	int dotIndexBack;
	int atIndex;
	
	public String getAtIndex(String e) {
		atIndex = e.indexOf("@");
		return e.substring(0,atIndex);
	}
	
	public String getDotIndex(String e) {
		dotIndexFront = e.indexOf(".");
		return e.substring(atIndex+1,dotIndexFront);
	}
	
	public String getDotIndexBack(String e) {
		return e.substring(dotIndexFront + 1,e.length()-1);
	}
	
}

public class EmailScanner {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String email;
		System.out.println("이메일을 입력하시오=>>");
		
		email = sc.next();
		
		if(email.indexOf("@") == -1 || email.indexOf(".") == -1) {
			System.out.println("올바른 이메일이 아닙니다.");
			return;
		} 
		
		EmailText letters = new EmailText();
		
		String allText;
		boolean okEmail = false;
		
		allText = letters.getAtIndex(email) + letters.getDotIndex(email) + letters.getDotIndexBack(email);
		
		for(int i = 0; i < allText.length()-1; i++) {
			char st = allText.charAt(i);
				if( (st > 0 && st < 10) || (st > 64 && st < 91) || (st > 112 || st < 122) || (st == 111))
					okEmail = true;
		}
		
		if (okEmail) {
			System.out.println("ok");
		} else {
			System.out.println("올바른 이메일이 아닙니다.");
		}
	}
}