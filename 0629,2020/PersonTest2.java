/*
���		 
person	 
�Ӽ�	 
�̸�  String name "�Ѹ�" 
����	 Char 'M', 'F'
����   int	30					

����	 
�Դ´� public void eat(String food)
�޸��� public void run()
*/	

class Person {
	private String name;
	private char gender;
	private int age;

	public void eat(String food) {
		System.out.println("������ "+ gender + "�� " + age + "�� " + name + " ��(��)" + food + "��(��) �Դ´�.");
	}

	public void run() {
		System.out.println("������ " + gender + "�� " + age + "�� " + name + " ��(��)" + " �޸���.");
	}
}

class PersonTest2 {
	public static void main(String[] args) {
		Person p; //��ü��������
		p = new Person();

		p.name = "������"; //�����߻�, person Ŭ������ private ���� ����ڿ� ������ �� ����. 
		p.gender = 'M';
		p.age = 20;
		p.run();
		p.eat("���");
	}
}

/*
����: java.lang.ClassNotFoundException: PersonTest2

C:\javaTest\Day0629>javac PersonTest2.java
PersonTest2.java:33: error: name has private access in Person
                p.name = "������";
                 ^
PersonTest2.java:34: error: gender has private access in Person
                p.gender = 'M';
                 ^
PersonTest2.java:35: error: age has private access in Person
                p.age = 20;
                 ^
*/