/*������ ���� �����ϴ� ���α׷� �ۼ� 
������ ���ұ��? 5 = 1*2*3*4*5
*/

import java.util.Scanner;

class FactorialTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int number;
		int fact = 1;

		System.out.println("���� ������� ���ұ��?");
		number = sc.nextInt();	
		

		for (int i = 1; i <= number ; i = i+1 ) {
			fact = fact * i;
		}

	  System.out.println(number + "������ ���� " +  fact);
  }	
}