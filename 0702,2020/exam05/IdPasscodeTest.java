/*
 사용자에게 아이디와 암호확인을 입력하여 입력조건이 바람직한지 판별하는 프로그램을 작성 

입력조건
1.  id 는 6글자 이상 , 12자 사이 , 첫글자는 영문으로 시작, 
2. 암호는 6글자 이상,  반드시 숫자, 영문, 특수기호를 포함해야 함 
3. 암호와 암호확인은 동일해야함. 

 */

package com.bit.exam05;
import java.util.ArrayList;
import java.util.Scanner;

class IdPasscode {
	boolean a;
	boolean b;
	boolean	c;
	
	public boolean idOk(String id) {
		if(id.length() > 6 && id.length() < 13) {
			a = true;
		}
		for (int i = 0; i < id.length(); i++)n{
			if(charAt(i) > 0; charAt(i) < 9; charAt() )
		}
		return a; 
	}
	
	public boolean PwdOk(String pwd) {
		if(pwd.length() > 6) {
			b = true;
		}
		return b; 
	}
	
	public boolean PwdCheckOK() {
		if(pwd.length() > 6) {
			b = true;
		}
		return b; 
	}

public static class IdPasscodeTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		 ArrayList<String> okID = new ArrayList<String>(); 
	     ArrayList<String> okPwd = new ArrayList<String>(); 
		
		
		String id, pwd, pwdCheck;
			
		System.out.print("아이디를 입력하세요:");
		id = sc.next();
	
		System.out.print("비밀번호 입력하세요:");
		pwd = sc.next();
		
		System.out.print("비밀번호 확인:");
		pwdCheck = sc.next();
				

	}

}
