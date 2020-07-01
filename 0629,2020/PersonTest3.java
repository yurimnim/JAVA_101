/*
사람		 
person	 
속성	 
이름  String name "둘리" 
성별	 Char 'M', 'F'
나이   int	30					

동작	 
먹는다 public void eat(String food)
달린다 public void run()
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
		System.out.println("성별이 "+ gender + "인 " + age + "살 " + name + " 가(이)" + food + "를(을) 먹는다.");
	}

	public void run() {
		System.out.println("성별이 " + gender + "인 " + age + "살 " + name + " 가(이)" + " 달린다.");
	}
}

class PersonTest3 {
	public static void main(String[] args) {
		Person p; //객체참조변수
		p = new Person();

		p.setName("마이콜");
		p.setGender('M');
		p.setAge(20);
		p.run();
		p.eat("라면");

		//설정자
		p.setName("마이콜");
		p.setGender('M');
		p.setAge(20);

		//접근자
		System.out.println(p.getName());
		System.out.println(p.getGender());
		System.out.println(p.getAge());
	}
}

/*
원인: java.lang.ClassNotFoundException: PersonTest2

C:\javaTest\Day0629>javac PersonTest2.java
PersonTest2.java:33: error: name has private access in Person
                p.name = "마이콜";
                 ^
PersonTest2.java:34: error: gender has private access in Person
                p.gender = 'M';
                 ^
PersonTest2.java:35: error: age has private access in Person
                p.age = 20;
                 ^
*/