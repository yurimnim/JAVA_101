/*����ڿ��� ������ �� n�� �Է� �޾Ƽ� �� ���� ��� �̸� �� ���� 100�� ���� ���� ����ϰ�
�۾����� ���,
�ƴϸ� �׼��� ���� ��� �Ѵ㿡 �۾����� */ 

import java.util.Scanner;

class IfTest02 {

	public static void main(String[] args) {
		
		int input, input2, input3;

		Scanner sc = new Scanner(System.in); 
		System.out.println("�����Է�: ");
		input = sc.nextInt();

		input2 = input + 100;
		input3 = input * input;
		
		if (input > 0)
		{
			System.out.println(input2);
		}
		 else 
		{
		System.out.println(input3);
		}
		
		System.out.println("�۾�����");
	}
}