/*
������ ���� �����ϴ� ���α׷� �ۼ��Ͻÿ�
ex) ������ ���ұ��? 3
1���� 3������ ���� 6�Դϴ�. 
*/
import java.util.Scanner;

class SumTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int number;
		System.out.println("���� ������� ���ұ��?");
		number = sc.nextInt();	
		
		int sum = 0; // ���� ������ ������ ���� �ʿ��ϹǷ� 0�� ���� ��������� �� �������ָ�? ������ ���� �����Ƿ� ��������  
							// 1���� ������ ÷���� +1 �� ���� ���� �ٲ� 
							// �ذ��ؾ� �� ������ ���� �ʱ� ���� �޶��� �� ����

		for (int i = 1; i <= number ; i++) {
		sum = sum + i; //���� 
	  }
	  System.out.println(number + "������ ���� " + sum);
  }	
}