
class ComplexTest {

	public static void main(String[] args) {
		
		int i = 0;
		int sum = 0; 
		
		i = i + 1; // 1
		sum = sum + i; //1
		
		i = i + 1; // 2
		sum = sum + i; //3

		i = i + 1; // 3
		sum = sum + i; //6

		System.out.println(i);
		System.out.println(sum);

	}
}