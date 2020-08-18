package com.bit.exam06;

class Scnd extends Thread {
	public void run() {
			for(int i=20;i>=1;i--) {
				System.out.println(i + " 초 전입니다.");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}
			
		}
}	
public class Programming01{
	public static void main(String[] args) {
		
		Scnd t = new Scnd();
//		t.run();
		t.start();
		
	}

}
