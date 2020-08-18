package com.bit.exam05;

class Person implements Runnable {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("hello " + name);
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
		
		
		(new Thread(p1)).start();
		(new Thread(p2)).start();
		
		
	}

}
