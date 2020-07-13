package com.bit.exam03;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameTest01 {
	public static void main(String[] args) {
		JFrame f = new JFrame("현재 날짜와 시각표시");
		
		JLabel label = new JLabel("  여기에 현재시간이 표시됩니다.");
		f.add(label);
		
		//이건 제일 마지막에 
		f.setSize(400, 300);
		f.setVisible(true);
		
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
			
			label.setText(year+"년 "+month+"월 "+date+"일 "+ days[day] + "요일 " + ampm + hour +"시 " + minutes+"분 " + second + "초");
//			System.out.println(year+"년 "+month+"월 "+date+"일 "+ days[day] + "요일 " + ampm + hour +"시 " + minutes+"분 " + second + "초" );
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}		
	}
}
