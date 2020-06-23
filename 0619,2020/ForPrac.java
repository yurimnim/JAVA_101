import java.util.Scanner;

class ForPrac {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);	
		
		int input; 
		int sum = 0;

		System.out.println("input: ");
		input = sc.nextInt();
		
		for (int i = 1; i <= input ; i++ ) {
			sum = sum + i;
		}

	  System.out.println(input + "까지의 총 합은 " + sum);
	}
}