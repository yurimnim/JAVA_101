package com.bit.exam03;

// 모금액이 500,000원이 될때까지 성금자들이 입금하도록 코드를 수정해봅니다.
public class TvArs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		Person p1 = new Person("홍길동", account);
		Person p2 = new Person("이순신", account);
		Person p3 = new Person("유관순", account);
		Person p4 = new Person("강감찬", account);
		Person p5 = new Person("김유신", account);
		
		while(account.getBalance() < 500000) {
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
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("현재 모금액:" + account.getBalance());
		}
		System.out.println("최종 모금액:" + account.getBalance());
	}

}
