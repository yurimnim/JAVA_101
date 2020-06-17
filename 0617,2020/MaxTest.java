//사용자에게 두개의 정수를 입력받아 그 중에 큰 수를 찾아 출력하는 프로그램을 작성 
// 삼항연산자를 이용 
import java.util.Scanner;

class MaxTest {

	public static void main(String[] args) {
		
		int a,b,max;
		Scanner sc = new Scanner(System.in);

		System.out.println(" 첫번째 수 입력: ");
		a = sc.nextInt();
		
		System.out.println(" 두번째 수 입력: ");
		b = sc.nextInt();
	
	   max = (a>b)?a:b;

	   System.out.println(max + " 가 더 크다.");
		
	}
}