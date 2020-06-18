/*다음과 같이 동작하는 프로그램 작성 
어디까지 곱할까요? 5 = 5*4*3*2*1
*/

import java.util.Scanner;

class FactorialTest02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int number;
		int fact = 1;

		System.out.println("숫자 몇번까지 곱할까요?");
		number = sc.nextInt();	
		
		for (int i = number; i >= 1 ; i = i-1 ) {
			fact = fact * i;
			if (i != 1) {
				System.out.print(i + "*"); // println에서 ln 빼면 줄바꿈 안되고 출력
			}
		} 
		
	  System.out.println(number + "까지의 곱은 " +  fact);
  }	
}