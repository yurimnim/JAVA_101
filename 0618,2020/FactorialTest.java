/*다음과 같이 동작하는 프로그램 작성 
어디까지 곱할까요? 5 = 1*2*3*4*5
*/

import java.util.Scanner;

class FactorialTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int number;
		int fact = 1;

		System.out.println("숫자 몇번까지 곱할까요?");
		number = sc.nextInt();	
		

		for (int i = 1; i <= number ; i = i+1 ) {
			fact = fact * i;
		}

	  System.out.println(number + "까지의 곱은 " +  fact);
  }	
}