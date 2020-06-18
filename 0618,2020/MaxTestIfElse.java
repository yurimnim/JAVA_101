//사용자에게 두개의 정수를 입력받아 그 중에 큰 수를 출력하는 프로그램 작성 
//if else 이용

import java.util.Scanner;

class MaxTestIfElse {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int a,b, max; 
	
	System.out.println("첫번째 수 입력");
	a = sc.nextInt();

	System.out.println("첫번째 수 입력");
	b = sc.nextInt();

	if(a>b)
		max = a;
	else
		max = b;

	System.out.println("큰 수는 " + max + "입니다.");
  }

}