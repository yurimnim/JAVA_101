/*
 ����ڿ��� �����ϳ��� �Է¹޾� �Ҽ����� �Ǻ��ϴ� ���α׷� 
 �Ҽ�: 1�� �ڱ��ڽ����θ� �������� �� ����� ������ 2���� �� 
*/
import java.util.Scanner;

class PrimeNumber01 {
	
	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("�Ҽ����� �Ǻ��� ���ڸ� �Է��Ͻÿ�");
		n = sc.nextInt();
		
		int count = 0; //����� ������ ���� ���� 

		for (int i =1; i<=n; i++) {
			if (n % i == 0) {
				count = count + 1;
			}
		}

		if (count == 2) {
			System.out.println(n + " �� �Ҽ��Դϴ�.");
		} else {
			System.out.println(n + " �� �Ҽ��� �ƴմϴ�.");
		}
  }
}