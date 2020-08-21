package com.bit.exam04;

public class Producer extends Thread {
	private Product product;
	public Producer(Product product) {
		this.product = product;
	}
	
	public void run() {
		for(int i=1; i<= 10 ; i++) {
			product.makeNumber();
			try {
				Thread.sleep(200);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}