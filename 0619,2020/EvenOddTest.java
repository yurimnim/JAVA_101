/*
	 사용자에게 임의의 수  N 을 입력받아
	 1에서 N 까지의 짝수의 합과 짝수의 개수
	 홀수의 합 홀수의 개수 각각 구하여 출력
*/
import java.util.Scanner;

class EvenOddTest  {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input, oddSum = 0, evenSum = 0, even = 0, odd = 0;

		System.out.println("숫자입력");
		input = sc.nextInt();
		
		for (int i = 1; i <= input ; i++ ) {
			if (i % 2 == 1) {
				odd = odd + 1;
				oddSum = oddSum + i;
			} else if (i % 2 == 0) {
				even = even + 1;
				evenSum = evenSum + i;
			}
		}
		System.out.println(input + " 까지의 홀수의 개수는 " + odd + "개");
		System.out.println("홀수의 총 합은 " +  oddSum);
		System.out.println(input + " 까지의 짝수의 개수는 " + even);
		System.out.println("짝수의 총 합은 " + evenSum);
  }
}