class Person {
	private String name;
	private char gender;
	private int age;
	
	//생성자::: 객체 생성시 자동수행 되기 때문에  return 의 개념이 없다 (void, int...  이런거없음)
	public Person(char b, int a) {
		name = "고길동";
		gender = b;
		age = a;
	}

	public Person() {
		name = "희동";
		gender = 'M';
		age = 1;
	}
	
	public Person(String a, char b) {
		name = a;
		gender = b;
		age = 1; //임의로 초기화 
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
		System.out.println("성별이 "+ gender + "인 " + age + "살 " + name + " 가(이)" + food + "를(을) 먹는다.");
	}

	public void run() {
		System.out.println("성별이 " + gender + "인 " + age + "살 " + name + " 가(이)" + " 달린다.");
	}
}

class PersonTest6 {
	public static void main(String[] args) {
		
		Person p = new Person();
		p.run();

		Person e = new Person('F' , 20);
		e.run();

		Person r = new Person("공실이" , 'F');
		r.eat("라면");

		Person s = new Person("또치", 'F', 30);
		s.run();
	}
}