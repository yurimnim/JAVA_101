package com.bit.exam05;

public class ThreadTestA extends Thread {
	
	
	public void run() {
		for(int i=1; i<=10 ;i++) {
			System.out.print("A" + i + " ");
			try {
				Thread.sleep(200);
			}catch (Exception e) {

			}
		}
		
	}
}
