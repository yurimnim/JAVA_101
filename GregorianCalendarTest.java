package com.bit.exam02;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarTest {

	public static void main(String[] args) {
//		Calendar today = new Calendar(); //Cannot instantiate the type Calendar
		GregorianCalendar today = new GregorianCalendar();
//		System.out.println(today);		
		// Calendar 이용해서 오늘 날짜 출력해보기 
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH) + 1;
		int date = today.get(Calendar.DATE);
		int day = today.get(Calendar.DAY_OF_WEEK)-1;
		String[] days = {"일","월","화","수","목","금","토"};
		int hour = today.get(Calendar.HOUR_OF_DAY);
		String ampm = "오전 ";
		if(hour > 12) {
			ampm = "오후";
			hour = hour - 12;
		}
		int minutes = today.get(Calendar.MINUTE);
		int second =  today.get(Calendar.SECOND);
		
		System.out.println(year+"년 "+month+"월 "+date+"일 "+ days[day] + "요일 " + ampm + hour +"시 " + minutes+"분 " + second + "초" );
				
	}

}
