/* 
������ ���� �����ϴ� ���α׷� �ۼ� 
���� ��: �ټ��� �Է� 5
*
**
***
****
*****
*/
import java.util.Scanner;

class  PrintStarTree{
	public static void main(String[] args) {
		
		int star;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ���� ����ұ��?");
		star = sc.nextInt();
		
		int i = 1;
		while (i <= star) {
			int j = 1;
			while (j <= i) {
				System.out.print("*");
				j = j + 1;
			}
			i = i + 1;
			System.out.println();
		}
		int j = 1;
		
		}
  }
