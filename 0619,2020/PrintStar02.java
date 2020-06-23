/*
다음과 같이 동작하도록 아래 코드를 수정하시오 
실행 예 
별을 몇개 출력할까요 5
별을 몇줄 출력할까요? 3
*****
*****
*****
*/

import java.util.Scanner;

class PrintStar02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int rows, cols;
		
		System.out.println("별을 몇줄 출력할까요?");
		rows = sc.nextInt();
		
		System.out.println("별을 몇칸 출력할까요?");
		cols = sc.nextInt();
		
		for(int i =1; i<=rows ; i ++) {
			for (int j = 1; j <=cols; j++) {
				System.out.print("*");
			}
		System.out.println();
	}
  }
}