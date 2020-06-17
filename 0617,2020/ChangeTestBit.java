class ChangeTestBit {

	public static void main(String[] args) {
		
		int a = 7;
		int b = 8;

		a = a ^ b;
		b = b ^ a;
		a = a ^ b;  

		System.out.println( "a=" + a);
		System.out.println( "b=" + b);
	}
}