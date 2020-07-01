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

	public void setName(String n){
		name = n;
	}
	
	public void setGender(char a){
		gender = a;
	}

	public void setAge(int b){
		age = b;
	}

	public String getName(){
		return name;
	}
	
	public char getGender() {
		return gender;
	}

	public int getAge(){
		return age;
	}

	public void eat(String food) {
		System.out.println("������ "+ gender + "�� " + age + "�� " + name + " ��(��)" + food + "��(��) �Դ´�.");
	}

	public void run() {
		System.out.println("������ " + gender + "�� " + age + "�� " + name + " ��(��)" + " �޸���.");
	}
}

class PersonTest3 {
	public static void main(String[] args) {
		Person p; //��ü��������
		p = new Person();

		p.setName("������");
		p.setGender('M');
		p.setAge(20);
		p.run();
		p.eat("���");

		//������
		p.setName("������");
		p.setGender('M');
		p.setAge(20);

		//������
		System.out.println(p.getName());
		System.out.println(p.getGender());
		System.out.println(p.getAge());
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