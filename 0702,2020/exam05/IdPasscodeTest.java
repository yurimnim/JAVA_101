/*
 ����ڿ��� ���̵�� ��ȣȮ���� �Է��Ͽ� �Է������� �ٶ������� �Ǻ��ϴ� ���α׷��� �ۼ� 

�Է�����
1.  id �� 6���� �̻� , 12�� ���� , ù���ڴ� �������� ����, 
2. ��ȣ�� 6���� �̻�,  �ݵ�� ����, ����, Ư����ȣ�� �����ؾ� �� 
3. ��ȣ�� ��ȣȮ���� �����ؾ���. 

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
			
		System.out.print("���̵� �Է��ϼ���:");
		id = sc.next();
	
		System.out.print("��й�ȣ �Է��ϼ���:");
		pwd = sc.next();
		
		System.out.print("��й�ȣ Ȯ��:");
		pwdCheck = sc.next();
				

	}

}
