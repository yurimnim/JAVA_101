class Person {
	private String name;
	private char gender;
	private int age;
	
	//������::: ��ü ������ �ڵ����� �Ǳ� ������  return �� ������ ���� (void, int...  �̷��ž���)
	public Person(String n, char g, int a) {
		name = n;
		gender = g;
		age = a;
	}

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

class PersonTest4 {
	public static void main(String[] args) {
		Person p; //��ü��������
		p = new Person("�Ѹ�" , 'M', 20);
		
		//������
		
		//������
		System.out.println(p.getName());
		System.out.println(p.getGender());
		System.out.println(p.getAge());
	}
}