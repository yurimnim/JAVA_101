/*
약수테스트
약수: 나눠서 나머지가 0이 되는 수
사용자에게 n을 입력받아 약수를 모두 출력하는 프로그램작성
*/

import java.util.Scanner;

class  SubMultiple {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int input;
	int count = 0;
	
	System.out.println("숫자입력");
	input = sc.nextInt();
	
	for (int i = 1; i <= input; i ++ ) {
		if (input % i == 0 ) {
			count = count + 1;
			System.out.println(i);
	}
  }
 
 System.out.println("약수의 개수" + count);
 }
}