/*
	 ����ڿ��� ������ ��  N �� �Է¹޾�
	 1���� N ������ ¦���� �հ� ¦���� ����
	 Ȧ���� �� Ȧ���� ���� ���� ���Ͽ� ���
*/
import java.util.Scanner;

class EvenOddTest  {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input, oddSum = 0, evenSum = 0, even = 0, odd = 0;

		System.out.println("�����Է�");
		input = sc.nextInt();
		
		for (int i = 1; i <= input ; i++ ) {
			if (i % 2 == 1) {
				odd = odd + 1;
				oddSum = oddSum + i;
			} else if (i % 2 == 0) {
				even = even + 1;
				evenSum = evenSum + i;
			}
		}
		System.out.println(input + " ������ Ȧ���� ������ " + odd + "��");
		System.out.println("Ȧ���� �� ���� " +  oddSum);
		System.out.println(input + " ������ ¦���� ������ " + even);
		System.out.println("¦���� �� ���� " + evenSum);
  }
}