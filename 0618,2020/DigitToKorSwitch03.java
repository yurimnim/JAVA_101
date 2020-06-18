/*
 사용자 한테 0~9 사이의 수를 입력받아
한글 표기식 출력하는 프로그램 작성 

*/

import java.util.Scanner;

class DigitToKorSwitch03 {

	public static void main(String[] args) { 
	Scanner sc = new Scanner(System.in);
	int n;
	System.out.println("0~9 사이의 수를 입력: ");
	n = sc.nextInt();

	switch (n)
	{
	case 0: case 1: case 2: case 3: 
	System.out.println("삼"); break;
	case 4: case 5: case 6: case 7: 
	System.out.println("칠"); break;
	case 8: case 9: 
	System.out.println("구"); break;

// 5를 입력하면 7을 출력하고 탈출
// 2를 입력하면 3을 출력하고 탈출 

	} 
		System.out.println("작업종료");
 }
}
