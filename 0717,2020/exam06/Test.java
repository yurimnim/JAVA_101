package com.bit.exam06;

class MyThread extends Thread {
	String title;
	public MyThread(String title) {
		this.title = title;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(title + "" + i +" ");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
	}
}


public class Test {
	public static void main(String[] args) {
		MyThread a = new MyThread("A");
		MyThread b = new MyThread("B");
		MyThread c = new MyThread("C");
		
		a.start();
		b.start();
		c.start();
	}
}
