package com.bit.exam02;
import java.util.Calendar;
/*
 �����Է¹޾Ƽ� �׳��� �����Ǻ��ؼ� ���, ���ذ� �������� �Ǻ�
*/
import java.util.GregorianCalendar;
import java.util.Scanner;

public class BirthdayTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = {"","��","��","ȭ","��","��","��","��"};
		int year,month,date;
		
		System.out.print("������ �Է��Ͻÿ�.==>");	
		year =sc.nextInt();
		System.out.print("������ �Է��Ͻÿ�.==>");	
		month =sc.nextInt();
		System.out.print("������ �Է��Ͻÿ�.==>");	
		date =sc.nextInt();
		
		GregorianCalendar birthDate = new GregorianCalendar(year,month-1,date);
		int day = birthDate.get(Calendar.DAY_OF_WEEK);
		System.out.println("����� " + arr[day] + "���Ͽ� �¾���ϴ�.");
		
		System.out.print("����� �¾ " + year + "�⵵��");
		if(birthDate.isLeapYear(year)) {
			System.out.println(" �����Դϴ�.");
		}else {
			System.out.println(" ������ �ƴմϴ�.");
		}
	}
	
}
