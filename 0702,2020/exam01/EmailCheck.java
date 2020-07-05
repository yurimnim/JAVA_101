package com.bit.exam01;

import java.util.Scanner;
// @의 수가 1이 아닐때
// 시작이 공백일 때 ( next()로 입력받으면 조건 추가할 필요가 없다. )
// @의 앞뒤로 dot(.)이 연속으로 오는 경우
// 그 외 조건은 너무 복잡하여 생략

class Email {
	private String email;
	private int atcnt;
	private boolean r;
	
	public void setEmail(String email) {
		this.email = email;
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
		
		if (email.contains("..")) {
			return r;
		} else {
			return r = true;
		}
	}
	
	public boolean spaceCheck() {
		r = false;
		if (!email.startsWith(" ") || !email.endsWith(" ")) {
			r= true;
		} else {
			return r;
		}
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
		
		if (e.atCheck() && e.dotCheck() && e.spaceCheck()) {
			System.out.println("올바른 이메일 주소를 입력하였습니다.");
		} else {
			System.out.println("잘못된 이메일 주소를 입력하였습니다.");
		}
	}
}