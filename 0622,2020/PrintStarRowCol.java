/*While�� �̿��ؼ� ���α׷� �ۼ�
���� ���� ����ұ��? 3
��ĭ ? 5
*****
*****
*****
*/
import java.util.Scanner;

class PrintStarRowCol {
	public static void main(String[] args) {
		
		int col, row;

		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� ����ұ��?");
		row = sc.nextInt();

		System.out.println("���� ��ĭ ����ұ��?");
		col = sc.nextInt();

		int i = 1;
		while (i <= row) {
			int j = 1;
			while (j <= col) {
				System.out.print("*");
				j = j + 1;
			}
			i = i + 1;
			System.out.println();
		}
		int j = 1;
  }
}

