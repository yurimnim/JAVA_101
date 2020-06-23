/*
	사용자한테 N을 입력받아 N의 약수를 
	모두 출력하는 프로그램을 작성합니다.
*/
import java.util.Scanner;
import java.util.ArrayList;

class YaksuTest {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n;
		ArrayList list = new ArrayList();

		System.out.print("임의의 숫자를 입력하세요 : ");
		n = scan.nextInt();

		for(int i=1;i<=n;i++){
			if(n%i==0) {
				list.add(i);
			}
		}
		System.out.println(n + "의 약수는"+ list);
	}
}
