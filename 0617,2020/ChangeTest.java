class ChangeTest {

	public static void main(String[] args) {
		
		int a = 7;
		int b = 8;
		// a, b 두 변수의 값을 맞바꾸어 보세요. 
		int temp;
		
		temp = a;
		a = b;
		b = temp; 

		System.out.println( "a=" + a);
		System.out.println( "b=" + b);
	}
}