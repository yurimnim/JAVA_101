package com.bit.exam04;

import java.util.Scanner;

//사용자에게 이메일을 입력받아 아이디만 출력
public class StringTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner sc = new Scanner(System.in);
	 String email;
	 System.out.println("이메일을 입력하시오");
	 email = sc.next();
	 
	 String id = email.substring(0, email.indexOf("@"));
	 System.out.println(id);
	}

}
