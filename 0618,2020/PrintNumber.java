
//다음과 같이 동작하는 프로그램 작성 
//입력값 4 - 1234 출력
//실행 예 어디까지 출력할까요?

import java.util.Scanner;

class PrintNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int number;
		System.out.println("숫자 몇번까지 출력할까요?");
		number = sc.nextInt();	

		for (int i = 1; i <= number ; i++) {
		System.out.println(i); //실화냐
	  }
	  System.out.println("작업종료");
  }	
}


