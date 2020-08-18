package com.bit.exam06;

class Scnd3 implements Runnable {
	public void run() {
			for(int i=20;i>=1;i--) {
				System.out.println(i + " 초 전입니다.");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}
			System.out.println("발사!");
		}

}

class CountDownEvent extends Thread{
	int delay;
	String msg;
	public CountDownEvent(int delay,String msg) {
		this.delay = delay;
		this.msg = msg;
	}
	
	public void run() {
		try {
			Thread.sleep(delay);
		}catch(Exception e) {
			
		}
		System.out.println(msg);
	}
}

public class Programming3{
	public static void main(String[] args) {
		
		Scnd3 t = new Scnd3();
		CountDownEvent e = new CountDownEvent(2000, "연결장치분리");
//		t.run();
		(new Thread(t)).start();
		e.start();		
	}
}
