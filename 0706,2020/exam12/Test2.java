package com.bit.exam12;

interface InterA {
	
}

interface InterB {
	
}

class MyClass implements InterA,InterB {
	
}

public class Test2 {
	public static void main(String[] args) {
		
		MyClass obj = new MyClass();
		InterA a;
		InterB b;
		
		a = obj; //부모 참조변수가 자식클래스의 객체를 참조할 수 있음
		b = obj;
		b = (InterB) a;
		//a와 b가 서로 상관은 없지만 a와 b가 서로 동일한 객체를 바라보게 한 후 캐스팅하여 참조가능 
//		obj = a; 자식이 부모를 가르키는건 불법 
//		obj = b;
//		b = a; 부모 1 = 부모 2 (둘중하나가 형변환 안하면 불가능)
	

	}

}
