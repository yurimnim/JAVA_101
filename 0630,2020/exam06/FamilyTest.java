package com.bit.exam06;

class Family {
	public String name;
	public int age;
	public static String addr; //공동으로 사용하는 공간 
	
	public static void pro() {
		System.out.println("프로입니다");//객체없이 무관하게사용가능
	}
	
	public void info( ) {
		System.out.println("이름::" + name);
		System.out.println("나이::" + age);
		System.out.println("주소::" + addr);
	}
}

public class FamilyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Family.addr = "서울시 마포구 신수동";
		System.out.println("주소:" + Family.addr);
		// Family.name = "고길동"; Cannot make a static reference to the non-static field Family.name
		 Family.pro();
		
		Family f1 = new Family();
		Family f2 = new Family();
		
		f1.name = "둘리";
		f1.age = 5;
		f2.name = "희동";
		f2.age = 5;
		
		f1.info();
		f2.info();
		/*
		f1.addr ="제주도 서귀포시"; // 주소가 f1,f2 둘다 바뀜:: 공동 
		
		System.out.println(f1.name + ":" + f1.addr );
		System.out.println(f2.name + ":" + f2.addr);
		*/
	}
}
