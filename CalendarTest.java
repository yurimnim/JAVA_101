package com.bit.exam02;

import java.util.Calendar;

public class CalendarTest {

	public static void main1(String[] args) {
//		Calendar today = new Calendar(); //Cannot instantiate the type Calendar
		Calendar today = Calendar.getInstance();
//		System.out.println(today);		
		// Calendar �̿��ؼ� ���� ��¥ ����غ��� 
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH) + 1;
		int date = today.get(Calendar.DATE);
		int day = today.get(Calendar.DAY_OF_WEEK)-1;
		String[] days = {"��","��","ȭ","��","��","��","��"};
		int hour = today.get(Calendar.HOUR_OF_DAY);
		String ampm = "���� ";
		if(hour > 12) {
			ampm = "����";
			hour = hour - 12;
		}
		int minutes = today.get(Calendar.MINUTE);
		int second =  today.get(Calendar.SECOND);
		
		System.out.println(year+"�� "+month+"�� "+date+"�� "+ days[day] + "���� " + ampm + hour +"�� " + minutes+"�� " + second + "��" );
				
	}

	
}

