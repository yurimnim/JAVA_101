/*
 ����� ���� 0~9 ������ ���� �Է¹޾�
�ѱ� ǥ��� ����ϴ� ���α׷� �ۼ� 

*/

import java.util.Scanner;

class DigitToKorSwitch02 {

	public static void main(String[] args) { 
	Scanner sc = new Scanner(System.in);
	int n;
	System.out.println("0~9 ������ ���� �Է�: ");
	n = sc.nextInt();

	switch (n)
	{
	case 0: System.out.println("��"); break; 
	case 1: System.out.println("��"); break;
	case 2: System.out.println("��"); break;
	case 3: System.out.println("��"); break;
	case 4: System.out.println("��"); break;
	case 5: System.out.println("��"); break;
	case 6: System.out.println("��"); break;
	case 7: System.out.println("ĥ"); break;
	case 8: System.out.println("��"); break;
	case 9: System.out.println("��"); break;
	default: System.out.println("�߸��� �Է°� �Դϴ�");
	} 
		System.out.println("�۾�����");
 }
}
