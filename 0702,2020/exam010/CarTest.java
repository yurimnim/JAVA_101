package com.bit.exam010;

class Car {
	int speed;
	
	public Car() {
		System.out.println("Car construcor works"); 
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
		System.out.println("Speed:" + speed);
	}
}

class SportsCar extends Car{
	boolean turbo;
	public SportsCar() {
		System.out.println("스포츠카 생성자 동작함 ");
	}
	
	public void setTurbo(boolean flag) {
		turbo = flag;
		System.out.println("turbo on");
	}
}


public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		SportsCar scar = new SportsCar();
		scar.setSpeed(1000);
		scar.setTurbo(true);
	}

}
