/*
사용자에게 월을 입력받아 계절명을 출력
봄 345
여름 678
가을 9 10 11
겨울 12 1 2

*/

import java.util.Scanner;

class SeasonTest03  {
	public static void main(String[] args) {
		
		int a;
		String result = "겨울";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇월인가요? ");
		a = sc.nextInt();

// 입력값이 범위에 맞지않으면 메세지를 출력하고 
// 프로그램 중지 

		if (a < 1 || a > 12)
		{
			System.out.println("잘못된 입력값입니다.");
			return;
		}

		if (a == 3 || a == 4 || a == 5) // if(a >= 3 && a <=5)
		{
			result = "봄";
		}
		else if (a == 6 || a == 7 || a == 8) //else if(a >= 6 && a <=8)
		{
			result = "여름"; 
		}
		else if(a == 9 || a == 10 || a == 11)// else if(a >= 9 && a <= 11)
		{
			result = "가을"; 
		}
		System.out.println(a + "월은 " +  result + "입니다.");
	
	}
}
