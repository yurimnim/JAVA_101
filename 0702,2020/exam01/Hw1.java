package com.bit.exam01;

import java.util.Scanner;

public class Hw1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//올바른 이메일oooo@oooo.ooo 
		Scanner sc = new Scanner(System.in);
		System.out.println("이메일을 입력하세요");
		String email;
		email = sc.next();
		boolean f = email.contains("@");
		boolean t = email.contains(".");
		if (f == true && t == true) {
			System.out.println(email);
		}else {
			System.out.println("잘못된 이메일을 입력하셨습니다");
			return;
		}
	}
}
