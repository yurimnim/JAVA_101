package com.bit.exam03;

// ��ݾ��� 500,000���� �ɶ����� �����ڵ��� �Ա��ϵ��� �ڵ带 �����غ��ϴ�.
public class TvArs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		Person p1 = new Person("ȫ�浿", account);
		Person p2 = new Person("�̼���", account);
		Person p3 = new Person("������", account);
		Person p4 = new Person("������", account);
		Person p5 = new Person("������", account);
		
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
			System.out.println("���� ��ݾ�:" + account.getBalance());
		}
		System.out.println("���� ��ݾ�:" + account.getBalance());
	}

}
