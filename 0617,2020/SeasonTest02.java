/*
����ڿ��� ���� �Է¹޾� �������� ���
�� 345
���� 678
���� 9 10 11
�ܿ� 12 1 2

*/

import java.util.Scanner;

class SeasonTest02  {
	public static void main(String[] args) {
		
		int a;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����ΰ���? ");
		a = sc.nextInt();

// �Է°��� ������ ���������� �޼����� ����ϰ� 
// ���α׷� ���� 

		if (a < 1 || a > 12)
		{
			System.out.println("�߸��� �Է°��Դϴ�.");
			return;
		}

		if (a == 3 || a == 4 || a == 5) // if(a >= 3 && a <=5)
		{
			System.out.println(a + "���� �� �Դϴ�.");
		}
		else if (a == 6 || a == 7 || a == 8) //else if(a >= 6 && a <=8)
		{
			System.out.println(a + "���� ���� �Դϴ�."); 
		}
		else if (a == 9 || a == 10 || a == 11)// else if(a >= 9 && a <= 11)
		{
			System.out.println(a + "���� ���� �Դϴ�."); 
		}
		else// ����� �״�� 
		{
			System.out.println(a + "���� �ܿ� �Դϴ�."); 
		}
	}
}
