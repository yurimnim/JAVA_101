package com.bit.exam06;

import java.util.ArrayList;

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
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("�̼���", "����", "010-1234-5678"));
		list.add(new Student("������", "����", "010-1333-4444"));
		list.add(new Student("������", "���", "010-4444-5555"));
		
//		for(int i=0;i<list.size();i++) {
//			Student s = list.get(i);
//			System.out.println(s);
//		}
//		System.out.println();
		for(Student student : list) {
			System.out.println(student.toString());
		}
	}

}
