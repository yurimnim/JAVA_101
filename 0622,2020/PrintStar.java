//������ ���� �۵��ϴ� ���α׷� while �� �̿��� �ۼ�
//���� �����ұ��? 3 ***

import java.util.Scanner;

class  PrintStar {
	public static void main(String[] args) {
		
		int input;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� � ����ұ��?");
		input = sc.nextInt();

		int i = 1;	

		while (i <= input){ //���� ���ǽĸ� �����ֱ���
			System.out.print("*");
			i = i + 1;
		}
	System.out.println();
	System.out.println(i); //while ������ Ż���� ����

  }
}