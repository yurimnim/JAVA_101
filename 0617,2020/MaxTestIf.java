/* 2개의 정수 a,b를 입력 받아  a가 더 큰지 b가 더 큰지 아니면 서로 같은지 판별하는 프로그램을 작성*/

import java.util.Scanner;

class  MaxTestIf {
	public static void main(String[] args) {
		
		int a, b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 수 입력: ");
		a = sc.nextInt();
	
		System.out.println(" 두번째 수 입력: ");
		b = sc.nextInt();

		if (a > b)
		{
			System.out.println(a + " 가 더 큽니다.");
		}
		else if (b > a)
		{
			System.out.println(b + "가 더 큽니다.");
		}
		else 
		{
			System.out.println("같은 값");
		}
	}
}
