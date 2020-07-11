package com.bit.exam05;

import java.util.ArrayList;

class Student {
	private String name;
	private String address;
	private String phoneNo;
	
	public Student(String name, String address, String phoneNo) {
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", phoneNo=" + phoneNo + "]";
	}		
}

public class Programming08 {	
	public static void main(String[] args) {
		Student a = new Student("�Ѹ�", "����� �ڹٵ�", "119-112"); 
		Student b = new Student("��浿", "����� �ڹٵ�", "119-112"); 
		Student c = new Student("������", "����� �ڹٵ�", "119-112"); 
		
		ArrayList<Student> list = new ArrayList<Student>();
		 list.add(a);
		 list.add(b);
		 list.add(c);
		 
		 for (Student student : list) {
			 System.out.println(student.toString());
		}
		 
		 list.remove(a);
		 list.remove(0);
		 System.out.println(list);
	
		}

}
