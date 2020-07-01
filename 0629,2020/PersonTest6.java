class Person {
	private String name;
	private char gender;
	private int age;
	
	//������::: ��ü ������ �ڵ����� �Ǳ� ������  return �� ������ ���� (void, int...  �̷��ž���)
	public Person(char b, int a) {
		name = "��浿";
		gender = b;
		age = a;
	}

	public Person() {
		name = "��";
		gender = 'M';
		age = 1;
	}
	
	public Person(String a, char b) {
		name = a;
		gender = b;
		age = 1; //���Ƿ� �ʱ�ȭ 
	}

	public Person(String n, char g, int a) {
		name = n;
		gender = g;
		age = a;
	}

	//setter
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

class PersonTest6 {
	public static void main(String[] args) {
		
		Person p = new Person();
		p.run();

		Person e = new Person('F' , 20);
		e.run();

		Person r = new Person("������" , 'F');
		r.eat("���");

		Person s = new Person("��ġ", 'F', 30);
		s.run();
	}
}