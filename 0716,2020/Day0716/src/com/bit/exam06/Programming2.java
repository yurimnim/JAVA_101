package com.bit.exam06;

class Scnd2 implements Runnable {
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
public class Programming2{
	public static void main(String[] args) {
		
		Scnd2 t = new Scnd2();
//		t.run();
		(new Thread(t)).start();
		
	}

}
