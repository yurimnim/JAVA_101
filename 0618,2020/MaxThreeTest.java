/*
��������� 3���� ���� �Է¹޾� ���߿�
���� ū���� ã�� ����ϴ� ���α׷��� �ۼ��մϴ�.
��ø if���� �̿��մϴ�.
*/

import java.util.Scanner;
class MaxThreeTest

{
	public static void main(String[] args) 
	{
		int a,b,c,max;

		Scanner sc = new Scanner(System.in);

		System.out.println("���ڸ� �Է��ϼ���");
		a = sc.nextInt();
		System.out.println("���ڸ� �Է��ϼ���");
		b = sc.nextInt();
		System.out.println("���ڸ� �Է��ϼ���");
		c = sc.nextInt();
		
		max = 0; //  "" �� String �����θ� ��� ����

		if(a > b)
			max = a;
		if(a < b)
			max = b;
		else
			if(a > b && a < b)
				max = c;
		System.out.println("ū ����" + max + "�Դϴ�");
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
			System.out.println("ū ����" + max)
		
*/

	}
}
