
//������ ���� �����ϴ� ���α׷� �ۼ� 
//�Է°� 4 - 1234 ���
//���� �� ������ ����ұ��?

import java.util.Scanner;

class PrintNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int number;
		System.out.println("���� ������� ����ұ��?");
		number = sc.nextInt();	

		for (int i = 1; i <= number ; i++) {
		System.out.println(i); //��ȭ��
	  }
	  System.out.println("�۾�����");
  }	
}


