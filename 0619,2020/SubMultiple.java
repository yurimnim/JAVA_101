/*
����׽�Ʈ
���: ������ �������� 0�� �Ǵ� ��
����ڿ��� n�� �Է¹޾� ����� ��� ����ϴ� ���α׷��ۼ�
*/

import java.util.Scanner;

class  SubMultiple {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int input;
	int count = 0;
	
	System.out.println("�����Է�");
	input = sc.nextInt();
	
	for (int i = 1; i <= input; i ++ ) {
		if (input % i == 0 ) {
			count = count + 1;
			System.out.println(i);
	}
  }
 
 System.out.println("����� ����" + count);
 }
}