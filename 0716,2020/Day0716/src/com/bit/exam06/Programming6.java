package com.bit.exam06;
import java.awt.Font;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import javax.swing.JLabel;

class PrintNow extends JFrame implements Runnable {
	JLabel jlb;
	
	public PrintNow() {
		Font f = new Font("Verdana", Font.BOLD, 30);
		jlb = new JLabel();
		jlb.setFont(f);
		setTitle("Digital Clock");
		add(jlb);
		setSize(400, 200);
		setVisible(true);
	}
	
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
		String hi = hour + " : " + minute + " : " + second; 
		try {
			jlb.setText(hi);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
	}
 }
}

public class Programming6 {
	public static void main(String[] args) {
		PrintNow hc = new PrintNow();
		(new Thread(hc)).start();
	}
	
}
