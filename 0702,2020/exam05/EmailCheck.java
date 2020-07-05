package com.bit.exam05;

import java.util.Scanner;

class Email {
	private String email;
	private int atcnt;
	private boolean r;
	private int dotcnt;
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	//바람직한 도메인으로 끝나는지 판별하는 메소드
	public boolean vaildEnd() {
		r = false;
		String [] arr = {".co.kr", ".go.kr",".or.kr", ".net", ".com", ".edu"};
		
		for(String a :arr) {
			if(email.endsWith(a)) {
				r = true;
				break;
			}
		}
	
		
		return r;
	}
	
	
	
	public boolean validEmail() {
		r = false;
		if(atCheck() && dotCheck() && spaceCheck() && vaildEnd() )
		{
			System.out.println("바람직하게 끝납니다.");			
			
			int atIdx = email.indexOf("@");
			if(dotcnt == 1) {
				int dotIdx = email.indexOf(".");
				if(atIdx >= 2 && (dotIdx - atIdx) >= 3 && (email.length() - dotIdx) >=3) {
					r = true;
				}
			}else if(dotcnt == 2) {  //tiger@naver.co.kr
				int dotIdx_1 = email.indexOf(".");
				int dotIdx_2 = email.indexOf(".", dotIdx_1+1);
				if(atIdx >= 2 && (dotIdx_1 - atIdx) >= 3 && (email.length() - dotIdx_2) >=3 && (dotIdx_2 - dotIdx_1) >= 3) {
					r = true;
				}
			}
		}
		return r;
	}

	public boolean atCheck() {
		r = false;
		atcnt = 0;
		
		for (int i = 0; i < email.length(); i++) {
			if(String.valueOf(email.charAt(i)).equals("@")) {
				atcnt++;
			}
		}
		
		if (atcnt == 1) {
			r = true;
		} 
		
		return r;
	}
	
	public boolean dotCheck() {
		r = false;
		dotcnt = 0;
		
		for (int i = 0; i < email.length(); i++) {
			if(String.valueOf(email.charAt(i)).equals(".")) {
				dotcnt++;
			}
		}
		
		if (dotcnt == 1 || dotcnt == 2) {
			r = true;
		} 
		
		return r;
	}
	
	public boolean spaceCheck() {
		r = false;
		if (!email.startsWith(" ") && !email.endsWith(" ")) {
			r = true;
		}
		return r;
	}
}
public class EmailCheck {

	public static void main(String[] args) {
		Email e = new Email();
		Scanner sc = new Scanner(System.in);
		String email;
		
		System.out.print("이메일 주소를 입력하세요 ==> ");
		email = sc.nextLine();
		
		e.setEmail(email);
		
		if ( e.validEmail()) {
			System.out.println("올바른 이메일 주소를 입력하였습니다.");
		} else {
			System.out.println("잘못된 이메일 주소를 입력하였습니다.");
		}
	}
	
}