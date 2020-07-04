package com.bit.exam05;
/*
 * 사용자한테 이름과 주민번호를 입력받아 무료암검진 대상자인지 판별하고
 * 무료암검진 항목을 출력하는 프로그램을 작성합니다.
 * << 처리 조건 >>
 * 무료암검진 대상자는 나이가 40세 이상이고 그 해가 홀수년도이면 홀수년도에 태어나고
 * 그해가 짝수년도이면 짝수년도에 태어난 사람이다.
 * 나이가 40세 이상 남자이면 무료암검진 항목은 간암, 위암 이며
 * 나이가 40세 이상 여자이면 무료암검진 항목 간암, 위암, 유방암, 자궁암이며
 * 나이가 50세 이상 남자이면 무료암검진 항목은 간암, 위암, 대장암이며
 * 나이가 50세 이상 여자이면 무료암검진 항목은 간암, 위암, 대장암, 유방암, 자궁암이다.
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
		 list.add("간암");
		 list.add("위암");
		 
		 if (age >= 50 && gender.equals("Female")) {
			 list.add("대장암");
			 list.add("유방암");
			 list.add("자궁암");
		 } 
		 else if (age >= 50 && gender.equals("Male")) {
			 list.add("대장암");
		 }
		 else if (age >= 40 && gender.equals("Female")) {
			 list.add("유방암");
			 list.add("자궁암");
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
		System.out.println("이름을 입력하세요 : ");
		name = scan.next();
		System.out.println("주민번호를 입력하세요 : ");
		jumin = scan.next();
		
		c.setName(name);
		c.setJumin(jumin);
		
		if(c.isValid()) {
			System.out.println(c.getName()+"님, 무료암검진 대상자 입니다.");
			System.out.println("암검진 항목은 " + c.getResult());
		}else {
			System.out.println(c.getName() + "님, 무료암검진 대상자가 아닙니다.");
		}
	}
}









