class MethodTest3 {
	public static void sayHello(String name, int n) { //매개변수 생성 
		for(int i =1; i<=n; i++){
		System.out.println( name + "야안녕!!");
		}
	}//메소드의 정의 

	public static void main(String[] args) {
		sayHello("재호", 5);
		int year = 2020;
		System.out.println(year);
		sayHello("둘리", 2);
		String title = "졸려주금";
		System.out.println(title);
		sayHello("또치", 10);

	}
}