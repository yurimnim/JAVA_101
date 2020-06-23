/*
소수테스트
사용자에게 n을 입력받아 약수를 모두 출력하는 프로그램작성
*/

import java.util.Scanner;

class  PrimeNumber {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input, count = 0;
		
		System.out.println("숫자입력");
		input = sc.nextInt();
		
		for (int i = 1; i <= input; i++ ) {
			if (input % i == 0 ) 
				count = count + 1;		
		}

		if (count == 2) 
			System.out.println(input + " 은 소수입니다.");
		else
			System.out.println(input + " 은 소수가 아닙니다.");
	  }
  }
