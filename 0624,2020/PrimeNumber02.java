/*
 
 */
import java.util.Scanner;

class PrimeNumber02 {
	
	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("�Ҽ����� �Ǻ��� ���ڸ� �Է��Ͻÿ�");
		n = sc.nextInt();
		boolean isPrime = true;
		if ( n == 1) {
			System.out.println("�Ҽ��� �ƴմϴ�.");
			 return;
		}

		 //����� ������ ī��Ʈ ����

		for (int i =2; i<n; i++) {
			if (n % i == 0) {
				isPrime = false;
				break; //�� ���ϸ� ��� ������ ���ƹ��� 
			}
		}	
		if (isPrime) { 
			System.out.println("�Ҽ��Դϴ�.");
		} else {
			System.out.println("�Ҽ��� �ƴմϴ�.");
		}
  }
}