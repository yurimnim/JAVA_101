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
		return "[이름=" + name + ", 주소=" + addr + ", 전화번호=" + tel + "]";
	}		
}


public class StudentTest {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		
		
		while(true) {
			int sel;
			System.out.print("학생관리시스템");
			System.out.print("등록 : 1 ");
			System.out.print("출력 : 2 ");
			System.out.print("검색 : 3 ");
			System.out.print("삭제 : 4 ");
			System.out.print("종료 : 0 ");
			System.out.print("입력하세요===>");
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
		System.out.println("프로그램을 종료합니다.");
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
		System.out.println("등록할 학생의 이름을 입력하시오");
		name=sc.next();
		System.out.println("주소를 입력하시오");
		addr=sc.next();
		System.out.println("전화번호 입력하시오");
		tel=sc.next();
		
		list.add(new Student(name, addr, tel));
	}

}
