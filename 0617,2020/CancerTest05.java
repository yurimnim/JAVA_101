/*
연습 
사용자한테 이름과 주민번호를 입력받아 무료 암검진 대상자인지 판별하는 프로그램 작성
 처리조건 : 무료암검진 대상자는 다음의 조건 만족 : 나이 40세이상, 올해의 연도가 짝수연도 이면 짝수 연도에
태어난사람, 홀수이면 홀수에 태어난사람 . 
*/

import java.util.Scanner;
import java.util.Date;

class CancerTest05 {
    public static void main(String[] args) {
		String name, ssNo;
		Scanner sc = new Scanner(System.in);
		Date today = new Date();

		int currentYear = today.getYear() + 1900;

		System.out.println("이름: ");
		name = sc.next();

		System.out.println("주민등록번호: ");
		ssNo = sc.next();
		String year = ssNo.substring(0,2);

		int birthYear = Integer.parseInt(year) + 1900;
		int age = currentYear - birthYear + 1; 

		if (currentYear % 2 == birthYear % 2 && age >= 40)
			System.out.println(name + " 님은 올해 암검진 대상자 입니다.");
		else 
			System.out.println(name +  " 님은 올해 암검진 대상자가 아닙니다.");
	}
}

