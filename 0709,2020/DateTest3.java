package com.bit.exam09;

import java.util.Date;



public class DateTest3 {
	
	
	public static void main(String[] args) {
		Date today = new Date(); 
		int year= today.getYear();
		int month= today.getMonth();
		
		String[] days = {"일","월","화","수","목","금","토"};
		Date startDay = new Date(year, month, 1);
		int day = startDay.getDay();
		System.out.println("이달의 1일은 " + days[day] + "요일 이다.");
		
		
	}

}
