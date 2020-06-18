/*
사용자한테 3개의 수를 입력받아 그중에
가장 큰수를 찾아 출력하는 프로그램을 작성합니다.
중첩 if문을 이용합니다.
*/

import java.util.Scanner;
class MaxThreeTest

{
	public static void main(String[] args) 
	{
		int a,b,c,max;

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");
		a = sc.nextInt();
		System.out.println("숫자를 입력하세요");
		b = sc.nextInt();
		System.out.println("숫자를 입력하세요");
		c = sc.nextInt();
		
		max = 0; //  "" 는 String 값으로만 사용 가능

		if(a > b)
			max = a;
		if(a < b)
			max = b;
		else
			if(a > b && a < b)
				max = c;
		System.out.println("큰 수는" + max + "입니다");
/*
		if( a > b )
			if(a > c)
				max = a;
			else
				max = c;
			else
				if( b > c )
				max = b;
			else
				max = c;
			System.out.println("큰 수는" + max)
		
*/

	}
}
