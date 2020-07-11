package com.bit.exam07;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
	private String name;
	private String addr;
	private String tel;
	
	public Student(String name, String addr, String tel) {
		this.name = name;
		this.addr = addr;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "[�̸�=" + name + ", �ּ�=" + addr + ", ��ȭ��ȣ=" + tel + "]";
	}		
}


public class StudentTest {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		
		
		while(true) {
			int sel;
			System.out.print("�л������ý���");
			System.out.print("��� : 1 ");
			System.out.print("��� : 2 ");
			System.out.print("�˻� : 3 ");
			System.out.print("���� : 4 ");
			System.out.print("���� : 0 ");
			System.out.print("�Է��ϼ���===>");
			sel = sc.nextInt();
			if(sel == 0) {
				break;
			}
			switch(sel) {
				case 1:addStudent(list);break;
				case 2:printStudent(list);break;
//				case 3:searchStudent(list);break;
//				case 4:delStudent(list);break;
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
	}

	private static void delStudent(ArrayList<Student> list) {
		
	}

	private static void searchStudent(ArrayList<Student> list) {
		
		
	}

	private static void printStudent(ArrayList<Student> list) {
		for (Student s : list) {
		 System.out.println(s);	
		}	
	}

	private static void addStudent(ArrayList<Student> list) {
		String name,addr,tel;
		System.out.println("����� �л��� �̸��� �Է��Ͻÿ�");
		name=sc.next();
		System.out.println("�ּҸ� �Է��Ͻÿ�");
		addr=sc.next();
		System.out.println("��ȭ��ȣ �Է��Ͻÿ�");
		tel=sc.next();
		
		list.add(new Student(name, addr, tel));
	}

}
