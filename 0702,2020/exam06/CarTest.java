package com.bit.exam06;

class Car {
	int speed;
	public void setSpeed(int speed) {
		this.speed = speed;
		System.out.println("Speed:" + speed);
	}
}

class SportsCar extends Car{
	boolean turbo;
	public void setTurbo(boolean flag) {
		turbo = flag;
		System.out.println("turbo on");
	}
}


public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		Sport scar = new SportsCAr();
		scar.setSpeed(1000);
		scar.setTurbo(true);
	}

}
