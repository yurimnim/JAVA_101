/*������ ���� �����ϴ� ���α׷� �ۼ� 
������ ���ұ��? 5 = 5*4*3*2*1
*/

import java.util.Scanner;

class FactorialTest02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int number;
		int fact = 1;

		System.out.println("���� ������� ���ұ��?");
		number = sc.nextInt();	
		
		for (int i = number; i >= 1 ; i = i-1 ) {
			fact = fact * i;
			if (i != 1) {
				System.out.print(i + "*"); // println���� ln ���� �ٹٲ� �ȵǰ� ���
			}
		} 
		
	  System.out.println(number + "������ ���� " +  fact);
  }	
}