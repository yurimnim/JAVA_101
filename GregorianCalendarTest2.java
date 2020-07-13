package com.bit.exam02;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class GregorianCalendarTest2 {

	public static void main(String[] args) {
//		Calendar today = new Calendar(); //Cannot instantiate the type Calendar
		String[] days = {"일","월","화","수","목","금","토"};
		while(true){
			GregorianCalendar today = new GregorianCalendar();
			int year = today.get(Calendar.YEAR);
			int month = today.get(Calendar.MONTH) + 1;
			int date = today.get(Calendar.DATE);
			int day = today.get(Calendar.DAY_OF_WEEK)-1;
			
			int hour = today.get(Calendar.HOUR_OF_DAY);
			String ampm = "오전 ";
			if(hour >= 12) {
				ampm = "오후";
				hour = hour % 12;
				if(hour == 0) {
					hour = 12;
				}
			}
			int minutes = today.get(Calendar.MINUTE);
			int second =  today.get(Calendar.SECOND);
			
			System.out.println(year+"년 "+month+"월 "+date+"일 "+ days[day] + "요일 " + ampm + hour +"시 " + minutes+"분 " + second + "초" );
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}			
	}

}
