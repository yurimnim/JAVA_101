package com.bit.exam05;
	
	public class ThreadTestB extends Thread {
	
		
		public void run() {
			for(int i=1; i<=10 ;i++) {
				System.out.print("B"+ i + " ");
				try {
					Thread.sleep(200);
				}catch (Exception e) {

				}
			}
			
		}
	}

