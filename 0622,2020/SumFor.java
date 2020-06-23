/*
프로그램 작성
어디까지 더할까요? 10
결과 1에서 10까지의 합은 ## 입니다
출력하는 프로그램 작성
*/
import java.util.Scanner;

class SumFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		int sum = 0;
		
		System.out.println("숫자입력:");
		input = sc.nextInt();
		
		for (int i = 1;i <= input ; i++ ){
			sum = sum + i;
		}
		System.out.println("1 부터 " +  input + "까지의 합은 " + sum + " 입니다.");
	}
} 