package com.bit.exam01;


import java.util.InputMismatchException;
import java.util.Scanner;

public class DivdeByZeroTest {

	public static void main(String[] args) {
		
		try {
				int number1, number2, result;
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("ù��°����");
				number1 = sc.nextInt();
				
				System.out.println("�ι�°����");
				number2 = sc.nextInt();			
				result = number1/number2;
				System.out.println("���:" + result);
			} catch(ArithmeticException e) {
				//System.out.println("���ܹ߻�: " + e.getMessage());
				//System.out.println("0���� ������ �����ϴ�");
				 e.printStackTrace();
			} catch(InputMismatchException e) {
				//System.out.println("���ܹ߻�: " + e.getMessage());
				//System.out.println("���ڸ� �Է��� �� �ֽ��ϴ�.");
				 e.printStackTrace();
			}finally {
				System.out.println("�۾�����");
			}
			
	}

}
