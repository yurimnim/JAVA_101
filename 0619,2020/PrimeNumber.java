/*
�Ҽ��׽�Ʈ
����ڿ��� n�� �Է¹޾� ����� ��� ����ϴ� ���α׷��ۼ�
*/

import java.util.Scanner;

class  PrimeNumber {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input, count = 0;
		
		System.out.println("�����Է�");
		input = sc.nextInt();
		
		for (int i = 1; i <= input; i++ ) {
			if (input % i == 0 ) 
				count = count + 1;		
		}

		if (count == 2) 
			System.out.println(input + " �� �Ҽ��Դϴ�.");
		else
			System.out.println(input + " �� �Ҽ��� �ƴմϴ�.");
	  }
  }
