package com.bit.exam06;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;



class HiWhatTime extends Thread{
	public void run() {
		while(true) {
		GregorianCalendar now = new GregorianCalendar();
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
//		Date d = new Date();	
//		int hour = d.getHours();
//		int minute = d.getMinutes();
//		int second = d.getSeconds();
		String hi = "안녕! 지금은 " + hour + "시 " + minute + "분 " + second + "초 란다!"; 	
		
		System.out.println(hi);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
	}
 }
}

public class Programming04 {
	public static void main(String[] args) {
		HiWhatTime h = new HiWhatTime();
		h.start();
	}
	
}
