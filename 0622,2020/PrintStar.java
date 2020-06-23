//다음과 같이 작동하는 프로그램 while 문 이용해 작성
//별을 몇개출력할까요? 3 ***

import java.util.Scanner;

class  PrintStar {
	public static void main(String[] args) {
		
		int input;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("별을 몇개 출력할까요?");
		input = sc.nextInt();

		int i = 1;	

		while (i <= input){ //최종 조건식만 적어주기잉
			System.out.print("*");
			i = i + 1;
		}
	System.out.println();
	System.out.println(i); //while 문에서 탈주한 남바

  }
}