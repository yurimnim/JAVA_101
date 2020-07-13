package com.bit.exam03;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

class NowFrame extends JFrame {
	private JLabel label; //�޼ҵ带 Ŭ���� �ȿ� �������� �׷캯���� �����Ҽ� ����!!!
	
	
	public NowFrame() {
		label = new JLabel("���� �ð��� ���⿡ ǥ�õ˴ϴ�.");
		add(label);
		setSize(400, 300);
		setVisible(true);
		printNow();
	}

	public void printNow() {
			String[] days = {"��","��","ȭ","��","��","��","��"};
			while(true){
				GregorianCalendar today = new GregorianCalendar();
				int year = today.get(Calendar.YEAR);
				int month = today.get(Calendar.MONTH) + 1;
				int date = today.get(Calendar.DATE);
				int day = today.get(Calendar.DAY_OF_WEEK)-1;
				
				int hour = today.get(Calendar.HOUR_OF_DAY);
				String ampm = "���� ";
				if(hour >= 12) {
					ampm = "����";
					hour = hour % 12;
					if(hour == 0) {
						hour = 12;
					}
				}
				int minutes = today.get(Calendar.MINUTE);
				int second =  today.get(Calendar.SECOND);
				
				
				label.setText(year+"�� "+month+"�� "+date+"�� "+ days[day] + "���� " + ampm + hour +"�� " + minutes+"�� " + second + "��");
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
