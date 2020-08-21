package com.bit.exam05;

public class ThreadTestC extends Thread {
	
	public void run() {
		for(int i=1; i<=10 ;i++) {
			System.out.print("C" + i +" ");
			try {
				Thread.sleep(200);
			}catch (Exception e) {

			}
		}
		
	}
}

