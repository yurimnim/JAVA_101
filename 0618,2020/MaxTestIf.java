//if �� ������ ū �� ã�� ���α׷� �ۼ� 

import java.util.Scanner;

class MaxTestIf {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int a,b,max; 
	
	System.out.println("ù��° �� �Է�");
	a = sc.nextInt();

	System.out.println("�ι�° �� �Է�");
	b = sc.nextInt();

	max = a;
	
	if(b > a)
		max =b;
		
	System.out.println("ū ���� " + max + "�Դϴ�.");
  }
}