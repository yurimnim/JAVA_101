/*
다음과 같이 동작하는 프로그램 작성하시오
ex) 어디까지 더할까요? 3
1에서 3까지의 합은 6입니다. 
*/
import java.util.Scanner;

class SumTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int number;
		System.out.println("숫자 몇번까지 더할까요?");
		number = sc.nextInt();	
		
		int sum = 0; // 먼저 누적을 시작할 값이 필요하므로 0을 먼저 선언해줘야 함 안정해주면? 더해줄 값이 없으므로 오류가남  
							// 1부터 넣으면 첨부터 +1 이 들어가서 값이 바뀜 
							// 해결해야 할 문제에 따라 초기 값이 달라질 수 있음

		for (int i = 1; i <= number ; i++) {
		sum = sum + i; //누적 
	  }
	  System.out.println(number + "까지의 합은 " + sum);
  }	
}