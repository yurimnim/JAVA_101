//����ڿ��� 3���� ���� �Է¹޾� ���� ū ���� ã�� ����ϴ� ���α׷� �ۼ�

import java.util.Scanner;

class MaxTest05 {
      public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		 int a, b, c, max;

		 System.out.println("ù��° ���� �Է��Ͻʽÿ�");
		  a = sc.nextInt();
			
		System.out.println("�ι�° ���� �Է��Ͻʽÿ�");
		 b = sc.nextInt();

		 System.out.println("�� ��° ���� �Է��Ͻʽÿ�");
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

		 System.out.println("ū ���� " + max);
	 }
}

