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
		
		a = obj; //�θ� ���������� �ڽ�Ŭ������ ��ü�� ������ �� ����
		b = obj;
		b = (InterB) a;
		//a�� b�� ���� ����� ������ a�� b�� ���� ������ ��ü�� �ٶ󺸰� �� �� ĳ�����Ͽ� �������� 
//		obj = a; �ڽ��� �θ� ����Ű�°� �ҹ� 
//		obj = b;
//		b = a; �θ� 1 = �θ� 2 (�����ϳ��� ����ȯ ���ϸ� �Ұ���)
	

	}

}
