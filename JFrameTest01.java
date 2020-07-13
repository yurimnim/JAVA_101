package com.bit.exam03;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameTest01 {
	public static void main(String[] args) {
		JFrame f = new JFrame("���� ��¥�� �ð�ǥ��");
		
		JLabel label = new JLabel("  ���⿡ ����ð��� ǥ�õ˴ϴ�.");
		f.add(label);
		
		//�̰� ���� �������� 
		f.setSize(400, 300);
		f.setVisible(true);
		
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
//			System.out.println(year+"�� "+month+"�� "+date+"�� "+ days[day] + "���� " + ampm + hour +"�� " + minutes+"�� " + second + "��" );
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}		
	}
}
