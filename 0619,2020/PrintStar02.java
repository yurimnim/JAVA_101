/*
������ ���� �����ϵ��� �Ʒ� �ڵ带 �����Ͻÿ� 
���� �� 
���� � ����ұ�� 5
���� ���� ����ұ��? 3
*****
*****
*****
*/

import java.util.Scanner;

class PrintStar02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int rows, cols;
		
		System.out.println("���� ���� ����ұ��?");
		rows = sc.nextInt();
		
		System.out.println("���� ��ĭ ����ұ��?");
		cols = sc.nextInt();
		
		for(int i =1; i<=rows ; i ++) {
			for (int j = 1; j <=cols; j++) {
				System.out.print("*");
			}
		System.out.println();
	}
  }
}