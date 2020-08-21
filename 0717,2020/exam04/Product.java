package com.bit.exam04;

import java.util.Random;

public class Product {
	private int number;
	private boolean isNew;
	
	public synchronized void makeNumber() {
		while(isNew == true) {
			try {
				wait();
			}catch (Exception e) {
		
			}
		}
		
		Random r = new Random();
		number = r.nextInt(100)+1;
		System.out.println("������ ������:"+ number);
		isNew = true;
		notify();
	}
	
	public synchronized int useNumber() {
		while(isNew == false) {
			try {
				wait();
			}catch (Exception e) {

			}
		}
		
		System.out.println("�Һ��� �Һ���:"+ number);
		isNew = false;
		notify();
		return number;
	}
	
}
