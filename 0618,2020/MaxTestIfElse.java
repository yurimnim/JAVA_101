//����ڿ��� �ΰ��� ������ �Է¹޾� �� �߿� ū ���� ����ϴ� ���α׷� �ۼ� 
//if else �̿�

import java.util.Scanner;

class MaxTestIfElse {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int a,b, max; 
	
	System.out.println("ù��° �� �Է�");
	a = sc.nextInt();

	System.out.println("ù��° �� �Է�");
	b = sc.nextInt();

	if(a>b)
		max = a;
	else
		max = b;

	System.out.println("ū ���� " + max + "�Դϴ�.");
  }

}