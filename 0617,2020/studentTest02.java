//학생의 이름, 국어, 영어, 수학을 입력받아 
// 평균이 60점 이상이면 합격,  그렇지 않으면 불합격 출력

import java.util.Scanner;

class StudentTest02 {
   
   public static void main (String[] args) {
		String name;
		String result = "아직모름";
		int kor, eng, math, tot, avg;

		Scanner sc = new Scanner(System.in);

		System.out.println("이름: ");
		name = sc.next();

		System.out.println("국어: ");
		kor = sc.nextInt();

		System.out.println("영어: ");
		eng = sc.nextInt();

		System.out.println("수학: ");
		math = sc.nextInt();

		tot = kor + eng + math;
		avg = tot / 3;
		
		System.out.println("학생이름: " + name);
		System.out.println("평균점수: " + avg);

		if (avg >= 60)
			result = "합격"; 
		else 
			result = "불합격";

		System.out.println(result);
     }
   }
