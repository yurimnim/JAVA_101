/*
 ����� ���� 0~9 ������ ���� �Է¹޾�
�ѱ� ǥ��� ����ϴ� ���α׷� �ۼ� 

*/

import java.util.Scanner;

class DigitToKorSwitch03 {

	public static void main(String[] args) { 
	Scanner sc = new Scanner(System.in);
	int n;
	System.out.println("0~9 ������ ���� �Է�: ");
	n = sc.nextInt();

	switch (n)
	{
	case 0: case 1: case 2: case 3: 
	System.out.println("��"); break;
	case 4: case 5: case 6: case 7: 
	System.out.println("ĥ"); break;
	case 8: case 9: 
	System.out.println("��"); break;

// 5�� �Է��ϸ� 7�� ����ϰ� Ż��
// 2�� �Է��ϸ� 3�� ����ϰ� Ż�� 

	} 
		System.out.println("�۾�����");
 }
}
