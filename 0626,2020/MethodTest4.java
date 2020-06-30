class  MethodTest4{
	public static void gugudan(int num) {
		System.out.println(num + "´Ü");
		for(int i = 1; i <=9; i++) {	
			System.out.println(num + " * " + i + " = " +(num*i)); 
		}
		System.out.println();
	}
	public static void main(String[] args) {
		gugudan(2);
		gugudan(5);
	}
}
