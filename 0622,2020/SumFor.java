/*
���α׷� �ۼ�
������ ���ұ��? 10
��� 1���� 10������ ���� ## �Դϴ�
����ϴ� ���α׷� �ۼ�
*/
import java.util.Scanner;

class SumFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		int sum = 0;
		
		System.out.println("�����Է�:");
		input = sc.nextInt();
		
		for (int i = 1;i <= input ; i++ ){
			sum = sum + i;
		}
		System.out.println("1 ���� " +  input + "������ ���� " + sum + " �Դϴ�.");
	}
} 