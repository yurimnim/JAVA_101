package com.bit.exam02;
import java.util.Scanner;

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
		int dotcnt = 0;
		
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
	
	public boolean vaildEmail() {
		r = false;
		//tiger@naver.com 
		int atIdx = email.indexOf("@");
		int dotIdx = email.indexOf(".");
		if(atIdx >= 2 && (dotIdx - atIdx) >= 3 && (email.length() - dotIdx) >= 3) {
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
		
		System.out.print("�̸��� �ּҸ� �Է��ϼ��� ==> ");
		email = sc.nextLine();
		
		e.setEmail(email);
		
		if (e.atCheck() && e.dotCheck()&&e.vaildEmail()) {
			System.out.println("�ùٸ� �̸��� �ּҸ� �Է��Ͽ����ϴ�.");
		} else {
			System.out.println("�߸��� �̸��� �ּҸ� �Է��Ͽ����ϴ�.");
		}
	}
}