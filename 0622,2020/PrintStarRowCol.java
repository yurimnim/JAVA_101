/*While문 이용해서 프로그램 작성
별을 몇줄 출력할까요? 3
몇칸 ? 5
*****
*****
*****
*/
import java.util.Scanner;

class PrintStarRowCol {
	public static void main(String[] args) {
		
		int col, row;

		Scanner sc = new Scanner(System.in);
		System.out.println("별을 몇줄 출력할까요?");
		row = sc.nextInt();

		System.out.println("별을 몇칸 출력할까요?");
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

