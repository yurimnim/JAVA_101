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
	String name;
	char gender;
	int age;
	public void eat(String food) {
		System.out.println("성별이 "+ gender + "인 " + age + "살 " + name + " 가(이)" + food + "를(을) 먹는다.");
	}

	public void run() {
		System.out.println("성별이 " + gender + "인 " + age + "살 " + name + " 가(이)" + " 달린다.");
	}

}

class PersonTest {
	public static void main(String[] args) {
		Person p; //객체참조변수
		p = new Person();
		p.name = "마이콜";
		p.gender = 'M';
		p.age = 20;
		p.run();
		p.eat("라면");
	}
}
