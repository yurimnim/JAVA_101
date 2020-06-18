//if 만 가지고 큰 수 찾는 프로그램 작성 

import java.util.Scanner;

class MaxTestIf {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int a,b,max; 
	
	System.out.println("첫번째 수 입력");
	a = sc.nextInt();

	System.out.println("두번째 수 입력");
	b = sc.nextInt();

	max = a;
	
	if(b > a)
		max =b;
		
	System.out.println("큰 수는 " + max + "입니다.");
  }
}