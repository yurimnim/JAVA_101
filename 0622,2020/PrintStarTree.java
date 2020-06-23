/* 
다음과 같이 동작하는 프로그램 작성 
실행 예: 줄수를 입력 5
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
		
		System.out.println("별을 몇줄 출력할까요?");
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
