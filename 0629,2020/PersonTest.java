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
	String name;
	char gender;
	int age;
	public void eat(String food) {
		System.out.println("������ "+ gender + "�� " + age + "�� " + name + " ��(��)" + food + "��(��) �Դ´�.");
	}

	public void run() {
		System.out.println("������ " + gender + "�� " + age + "�� " + name + " ��(��)" + " �޸���.");
	}

}

class PersonTest {
	public static void main(String[] args) {
		Person p; //��ü��������
		p = new Person();
		p.name = "������";
		p.gender = 'M';
		p.age = 20;
		p.run();
		p.eat("���");
	}
}
