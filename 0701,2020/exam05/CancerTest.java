package com.bit.exam05;
/*
 * ��������� �̸��� �ֹι�ȣ�� �Է¹޾� ����ϰ��� ��������� �Ǻ��ϰ�
 * ����ϰ��� �׸��� ����ϴ� ���α׷��� �ۼ��մϴ�.
 * << ó�� ���� >>
 * ����ϰ��� ����ڴ� ���̰� 40�� �̻��̰� �� �ذ� Ȧ���⵵�̸� Ȧ���⵵�� �¾��
 * ���ذ� ¦���⵵�̸� ¦���⵵�� �¾ ����̴�.
 * ���̰� 40�� �̻� �����̸� ����ϰ��� �׸��� ����, ���� �̸�
 * ���̰� 40�� �̻� �����̸� ����ϰ��� �׸� ����, ����, �����, �ڱþ��̸�
 * ���̰� 50�� �̻� �����̸� ����ϰ��� �׸��� ����, ����, ������̸�
 * ���̰� 50�� �̻� �����̸� ����ϰ��� �׸��� ����, ����, �����, �����, �ڱþ��̴�.
 */
import java.util.Scanner;
import java.util.Calendar;
import java.util.ArrayList;

class Cancer {
	Calendar cal ;
	ArrayList<String> list;
	
	private String jumin;
	private String gender;
	private String name;
	private int age;
	private int thisYear;
	private int birthYear ;
	private boolean flag;
	
	public Cancer() {
		cal = Calendar.getInstance();
		thisYear = cal.get(Calendar.YEAR);
		list = new ArrayList<String>();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setJumin(String jumin) {
		this.jumin = jumin;
		birthYear = Integer.parseInt(this.jumin.substring(0, 2));
		getAge();
		getGender();
	}
	public int getAge() {
		// 850125-1234567
		int n = Integer.parseInt(jumin.substring(7, 8));
		
		if (n == 1 || n == 2 || n == 5 || n == 6)
			birthYear += 1900;
		
		if (n == 3 || n == 4 || n == 7 || n == 8)
			birthYear += 2000;
		
		age = thisYear - birthYear + 1;
		
		return age;
	}
	public String getGender() {
		int n = Integer.parseInt(jumin.substring(7, 8));
		
		if (n % 2 == 0)
			gender = "Female";
		else
			gender = "Male";
		
		return gender;
	}
	public boolean isValid() {
		//if (age >= 40 && ((thisYear % 2 == 0 && birthYear % 2 == 0) || (thisYear % 2 == 1 && birthYear % 2 == 1)))
		if (age >= 40 && thisYear % 2 == birthYear % 2)
			flag = true;
		else
			flag = false;
		
		return flag;
	}
	
	public ArrayList<String> getResult() {
		 list.add("����");
		 list.add("����");
		 
		 if (age >= 50 && gender.equals("Female")) {
			 list.add("�����");
			 list.add("�����");
			 list.add("�ڱþ�");
		 } 
		 else if (age >= 50 && gender.equals("Male")) {
			 list.add("�����");
		 }
		 else if (age >= 40 && gender.equals("Female")) {
			 list.add("�����");
			 list.add("�ڱþ�");
		 }
		 
		 return list;
	}
	
	
}

public class CancerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name, jumin;
		Cancer c = new  Cancer();
		Scanner scan = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ��� : ");
		name = scan.next();
		System.out.println("�ֹι�ȣ�� �Է��ϼ��� : ");
		jumin = scan.next();
		
		c.setName(name);
		c.setJumin(jumin);
		
		if(c.isValid()) {
			System.out.println(c.getName()+"��, ����ϰ��� ����� �Դϴ�.");
			System.out.println("�ϰ��� �׸��� " + c.getResult());
		}else {
			System.out.println(c.getName() + "��, ����ϰ��� ����ڰ� �ƴմϴ�.");
		}
	}
}









