/* 2���� ���� a,b�� �Է� �޾�  a�� �� ū�� b�� �� ū�� �ƴϸ� ���� ������ �Ǻ��ϴ� ���α׷��� �ۼ�*/

import java.util.Scanner;

class  MaxTestIf {
	public static void main(String[] args) {
		
		int a, b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° �� �Է�: ");
		a = sc.nextInt();
	
		System.out.println(" �ι�° �� �Է�: ");
		b = sc.nextInt();

		if (a > b)
		{
			System.out.println(a + " �� �� Ů�ϴ�.");
		}
		else if (b > a)
		{
			System.out.println(b + "�� �� Ů�ϴ�.");
		}
		else 
		{
			System.out.println("���� ��");
		}
	}
}
