package com.bit.exam06;

class Family {
	public String name;
	public int age;
	public static String addr; //�������� ����ϴ� ���� 
	
	public static void pro() {
		System.out.println("�����Դϴ�");//��ü���� �����ϰԻ�밡��
	}
	
	public void info( ) {
		System.out.println("�̸�::" + name);
		System.out.println("����::" + age);
		System.out.println("�ּ�::" + addr);
	}
}

public class FamilyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Family.addr = "����� ������ �ż���";
		System.out.println("�ּ�:" + Family.addr);
		// Family.name = "��浿"; Cannot make a static reference to the non-static field Family.name
		 Family.pro();
		
		Family f1 = new Family();
		Family f2 = new Family();
		
		f1.name = "�Ѹ�";
		f1.age = 5;
		f2.name = "��";
		f2.age = 5;
		
		f1.info();
		f2.info();
		/*
		f1.addr ="���ֵ� ��������"; // �ּҰ� f1,f2 �Ѵ� �ٲ�:: ���� 
		
		System.out.println(f1.name + ":" + f1.addr );
		System.out.println(f2.name + ":" + f2.addr);
		*/
	}
}
