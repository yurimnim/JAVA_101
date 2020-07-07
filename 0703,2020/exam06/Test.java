package com.bit.exam06;
 // Bird 클래스에 생성자를 추가하고  버드 객체를 생성한후  fly 메소드를 호출해봅니다. 
class Bird {
	String name;
	String color;
	boolean wing;
	
	
	public Bird(String name, String color, boolean wing) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.color=color;
		this.wing = wing;
	}


	public void fly() {
		if(wing) {
			System.out.println(color + "색 " + name + "이(가) 훨~훨~ ");
		}
	}
}

class AirPlane extends Bird {
	boolean engine;
	
	public AirPlane(String name, String color, boolean wing, boolean engine) {
		super(name, color, wing);
		this.engine = engine;
	}
	
	public void fly() {
		if(wing&&engine) {
			System.out.println(color + "색 " + name + "이(가) 슝슝~ ");
		}
	}
}

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird br = new Bird("까치", "빨간", true);		
		br.fly();	
		
		AirPlane ap = new AirPlane("경비행기","파란", true, true);
		ap.fly();
		
	}
}
