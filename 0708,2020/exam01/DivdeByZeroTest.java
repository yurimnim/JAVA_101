package com.bit.exam01;


import java.util.InputMismatchException;
import java.util.Scanner;

public class DivdeByZeroTest {

	public static void main(String[] args) {
		
		try {
				int number1, number2, result;
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("첫번째정수");
				number1 = sc.nextInt();
				
				System.out.println("두번째정수");
				number2 = sc.nextInt();			
				result = number1/number2;
				System.out.println("결과:" + result);
			} catch(ArithmeticException e) {
				//System.out.println("예외발생: " + e.getMessage());
				//System.out.println("0으로 나눌수 없습니다");
				 e.printStackTrace();
			} catch(InputMismatchException e) {
				//System.out.println("예외발생: " + e.getMessage());
				//System.out.println("숫자만 입력할 수 있습니다.");
				 e.printStackTrace();
			}finally {
				System.out.println("작업종료");
			}
			
	}

}
