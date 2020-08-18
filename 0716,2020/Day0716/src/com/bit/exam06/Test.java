package com.bit.exam06;
//thread class로 구현하기 

class Person extends Thread {
	private String name;
	public Person(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for(int i=1;i <=10;i++) {
			System.out.println("안녕 " + name);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				
			}	
		}	
	}	
}

public class Test {
	public static void main(String[] args) {
		Person p1 = new Person("고길동");
		Person p2 = new Person("둘리");
		Person p3 = new Person("또치");
		
		p1.setPriority(1);
		p2.setPriority(Thread.MIN_PRIORITY);
		p3.setPriority(Thread.MAX_PRIORITY); //or 10
		
		p1.start();
		p2.start();
		p3.start();
	
	}

}
