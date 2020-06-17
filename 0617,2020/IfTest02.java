/*사용자에게 임의의 수 n을 입력 받아서 그 수가 양수 이면 그 수의 100을 더한 값을 출력하고
작업종료 출력,
아니면 그수의 제곱 출력 한담에 작업종료 */ 

import java.util.Scanner;

class IfTest02 {

	public static void main(String[] args) {
		
		int input, input2, input3;

		Scanner sc = new Scanner(System.in); 
		System.out.println("숫자입력: ");
		input = sc.nextInt();

		input2 = input + 100;
		input3 = input * input;
		
		if (input > 0)
		{
			System.out.println(input2);
		}
		 else 
		{
		System.out.println(input3);
		}
		
		System.out.println("작업종료");
	}
}