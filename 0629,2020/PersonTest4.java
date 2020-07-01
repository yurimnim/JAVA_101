class Person {
	private String name;
	private char gender;
	private int age;
	
	//생성자::: 객체 생성시 자동수행 되기 때문에  return 의 개념이 없다 (void, int...  이런거없음)
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
		System.out.println("성별이 "+ gender + "인 " + age + "살 " + name + " 가(이)" + food + "를(을) 먹는다.");
	}

	public void run() {
		System.out.println("성별이 " + gender + "인 " + age + "살 " + name + " 가(이)" + " 달린다.");
	}
}

class PersonTest4 {
	public static void main(String[] args) {
		Person p; //객체참조변수
		p = new Person("둘리" , 'M', 20);
		
		//설정자
		
		//접근자
		System.out.println(p.getName());
		System.out.println(p.getGender());
		System.out.println(p.getAge());
	}
}