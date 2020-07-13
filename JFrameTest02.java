package com.bit.exam03;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

class NowFrame extends JFrame {
	private JLabel label; //메소드를 클래스 안에 만들어줘야 그룹변수에 접근할수 있지!!!
	
	
	public NowFrame() {
		label = new JLabel("현재 시간이 여기에 표시됩니다.");
		add(label);
		setSize(400, 300);
		setVisible(true);
		printNow();
	}

	public void printNow() {
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
				try {
					Thread.sleep(1000);
				}catch(Exception e) {
					
			}
		}
	}	
}

public class JFrameTest02 {
	
	public static void main(String[] args) {
		new NowFrame();
	}
}
