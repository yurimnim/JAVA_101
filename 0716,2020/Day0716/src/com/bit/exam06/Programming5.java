package com.bit.exam06;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import javax.swing.JLabel;

class HiWhatTimeClock extends Thread{
	public void run() {
		JFrame j = new JFrame();
		JLabel clk = new JLabel();
		j.setTitle("Digital Clock");
		j.add(clk);
		j.setSize(300, 100);
		j.setVisible(true);
		
		while(true) {
		GregorianCalendar now = new GregorianCalendar();
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
//		Date d = new Date();	
//		int hour = d.getHours();
//		int minute = d.getMinutes();
//		int second = d.getSeconds();
		String hi = hour + " : " + minute + " : " + second; 
		try {
			clk.setText(hi);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
	}
 }
}

public class Programming5 {
	public static void main(String[] args) {
		HiWhatTimeClock hc = new HiWhatTimeClock();
		hc.start();
	}
	
}
