package com.bit.exam01;

import java.util.Scanner;
// @�� ���� 1�� �ƴҶ�
// ������ ������ �� ( next()�� �Է¹����� ���� �߰��� �ʿ䰡 ����. )
// @�� �յڷ� dot(.)�� �������� ���� ���
// �� �� ������ �ʹ� �����Ͽ� ����

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
		
		System.out.print("�̸��� �ּҸ� �Է��ϼ��� ==> ");
		email = sc.nextLine();
		
		e.setEmail(email);
		
		if (e.atCheck() && e.dotCheck() && e.spaceCheck()) {
			System.out.println("�ùٸ� �̸��� �ּҸ� �Է��Ͽ����ϴ�.");
		} else {
			System.out.println("�߸��� �̸��� �ּҸ� �Է��Ͽ����ϴ�.");
		}
	}
}