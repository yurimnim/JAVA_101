package com.bit.exam02;
import java.util.Calendar;
/*
 생일입력받아서 그날의 요일판별해서 출력, 그해가 윤년인지 판별
*/
import java.util.GregorianCalendar;
import java.util.Scanner;

public class BirthdayTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = {"","일","월","화","수","목","금","토"};
		int year,month,date;
		
		System.out.print("생년을 입력하시오.==>");	
		year =sc.nextInt();
		System.out.print("생월을 입력하시오.==>");	
		month =sc.nextInt();
		System.out.print("생일을 입력하시오.==>");	
		date =sc.nextInt();
		
		GregorianCalendar birthDate = new GregorianCalendar(year,month-1,date);
		int day = birthDate.get(Calendar.DAY_OF_WEEK);
		System.out.println("당신은 " + arr[day] + "요일에 태어났습니다.");
		
		System.out.print("당신이 태어난 " + year + "년도는");
		if(birthDate.isLeapYear(year)) {
			System.out.println(" 윤년입니다.");
		}else {
			System.out.println(" 윤년이 아닙니다.");
		}
	}
	
}
