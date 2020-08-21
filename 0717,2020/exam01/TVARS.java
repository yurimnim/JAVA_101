package com.bit.exam01;

public class TVARS {

	public static void main(String[] args) {
		Account account = new Account();
		Person p1 = new Person("고길동", account);
		Person p2 = new Person("둘리", account);
		Person p3 = new Person("마이콜", account);
		Person p4 = new Person("고희동", account);
		Person p5 = new Person("도우너", account);
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
		
		try {
			p1.join();
			p2.join();
			p3.join();
			p4.join();
			p5.join();		
		} catch (Exception e) {

		}	
		
		System.out.println("모금액 " + account.getBalance());
	}	

}
