package com.bit.exam04;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person();
		//����ڰ� �����ڸ� ������ ������ �⺻�����ڸ� ���������� 
		//����ڰ� �����ڸ� ����� �����ϸ� ���̻� �⺻�����ڸ� �������� �ʴ´�.
		
		System.out.println(p.getName()); //
		System.out.println("|" + p.getGender() + "|");
		System.out.println(p.getAge());
		
		if(p.getGender() == ' ') {
			System.out.println("��ĭ�Դϴ�.");
		}else {
			System.out.println("��ĭ�� �ƴմϴ�.");
		}
	}
}
