package com.bit.exam09;

import java.util.Date;



public class DateTest3 {
	
	
	public static void main(String[] args) {
		Date today = new Date(); 
		int year= today.getYear();
		int month= today.getMonth();
		
		String[] days = {"��","��","ȭ","��","��","��","��"};
		Date startDay = new Date(year, month, 1);
		int day = startDay.getDay();
		System.out.println("�̴��� 1���� " + days[day] + "���� �̴�.");
		
		
	}

}
