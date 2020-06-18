/*
	사용자한테 몇월인지를 입력받아 마지막 날을 구하여 출력하는 프로그램 작성
	단 윤년에 대한 처리 안함 (평년 처리) 
*/

import java.util.Scanner;

class LastDateTest {
	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		int month; 
		String lastDay = "31일";

		System.out.println("월을 입력하세요.");
		month = sc.nextInt();

		if (month < 1 || month > 12 ) {
			System.out.println("잘못된 값 입니다.");
			return;
		}

		switch (month) {
			case 2: lastDay = "28일"; break;
			case 4: case 6: case 9: case 11: lastDay = "30일"; 
		}
		//Switch 안에 boolean 은 올 수 없음 int/String 값만 가능 


		System.out.println(month + " 월의 마지막 날은 " + lastDay + " 입니다.");
  }
}	
