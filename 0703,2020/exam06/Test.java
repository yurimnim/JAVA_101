package com.bit.exam06;
 // Bird Ŭ������ �����ڸ� �߰��ϰ�  ���� ��ü�� ��������  fly �޼ҵ带 ȣ���غ��ϴ�. 
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
			System.out.println(color + "�� " + name + "��(��) ��~��~ ");
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
			System.out.println(color + "�� " + name + "��(��) ����~ ");
		}
	}
}

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird br = new Bird("��ġ", "����", true);		
		br.fly();	
		
		AirPlane ap = new AirPlane("������","�Ķ�", true, true);
		ap.fly();
		
	}
}
