class MethodTest5{
	public static void sum(int c) {
		int total = 0;
		for(int i = 0; i <= c; i++) {
			total += i;
		}
		System.out.println(c + " 까지의 합은 : " +  total);
	}

	public static void add(int a, int b) {
			int r = a + b;
			System.out.println("더하기 결과: " +  r); 
	}

	public static void gugudan(int num) {
		System.out.println(num + "단");
		for(int i = 1; i <=9; i++) {	
			System.out.println(num + " * " + i + " = " +(num*i)); 
		}
		System.out.println();
	}

	public static void main(String[] args) {
		sum(10);
		add(2,3);
		gugudan(2);
		gugudan(5);
	}
}
