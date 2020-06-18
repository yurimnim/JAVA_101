/*
 사용자 한테 0~9 사이의 수를 입력받아
한글 표기식 출력하는 프로그램 작성 

*/

import java.util.Scanner;

class DigitToKorSwitch {

	public static void main(String[] args) { 
	Scanner sc = new Scanner(System.in);
	int n;
	System.out.println("0~9 사이의 수를 입력: ");
	n = sc.nextInt();

	switch (n)
	{
	case 0: 
		System.out.println("영");
	case 1: 
		System.out.println("일");
	case 2: 
		System.out.println("이");
	case 3: 
		System.out.println("삼");
	case 4: 
		System.out.println("사");
	case 5: 
		System.out.println("오");
	case 6: 
		System.out.println("육");
	} 
		System.out.println("작업종료");
 }
}
