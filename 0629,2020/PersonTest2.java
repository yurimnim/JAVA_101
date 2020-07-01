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

	public void eat(String food) {
		System.out.println("성별이 "+ gender + "인 " + age + "살 " + name + " 가(이)" + food + "를(을) 먹는다.");
	}

	public void run() {
		System.out.println("성별이 " + gender + "인 " + age + "살 " + name + " 가(이)" + " 달린다.");
	}
}

class PersonTest2 {
	public static void main(String[] args) {
		Person p; //객체참조변수
		p = new Person();

		p.name = "마이콜"; //오류발생, person 클래스의 private 접근 명시자에 접근할 수 없음. 
		p.gender = 'M';
		p.age = 20;
		p.run();
		p.eat("라면");
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