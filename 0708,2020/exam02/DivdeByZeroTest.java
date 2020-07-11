package com.bit.exam02;
import java.util.InputMismatchException;
import java.util.Scanner;

class DivideByZeroException extends Exception {
		public DivideByZeroException(String msg){
			super(msg);
		}
}

public class DivdeByZeroTest{	
	public static int quotient(int numerator, int denominator) throws DivideByZeroException{
		if(denominator == 0) {
			throw new DivideByZeroException("0으로 나눌 수 없습니다.");
		}
		return numerator / denominator;
	}

	public static void main(String[] args) {
		
		try {
				int number1, number2, result;
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("첫번째정수");
				number1 = sc.nextInt();
				System.out.println("두번째정수");
				number2 = sc.nextInt();			
				
				result = quotient(number1, number2);
				
				System.out.println("결과:" + result);
			} catch(InputMismatchException e) {	
				 e.printStackTrace();
			} catch(DivideByZeroException e) {
				 e.printStackTrace();
			}		
			finally {
				System.out.println("작업종료");
			}
			
	}

}
