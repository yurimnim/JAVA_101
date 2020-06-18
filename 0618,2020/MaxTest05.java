//사용자에게 3개의 수를 입력받아 가장 큰 수를 찾아 출력하는 프로그램 작성

import java.util.Scanner;

class MaxTest05 {
      public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		 int a, b, c, max;

		 System.out.println("첫번째 수를 입력하십시오");
		  a = sc.nextInt();
			
		System.out.println("두번째 수를 입력하십시오");
		 b = sc.nextInt();

		 System.out.println("세 번째 수를 입력하십시오");
		 c = sc.nextInt();
		

		 if (a>b)
			if(a>c)
				max = a;
		 	else
				max = c;	
		 else
			 if (b>c)
				max = b;
			 else
				max = c;

		 System.out.println("큰 수는 " + max);
	 }
}

