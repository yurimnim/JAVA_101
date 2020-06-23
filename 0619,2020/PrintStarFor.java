import java.util.Scanner;

class PrintStarFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("별을 몇개 출력할까요?");
		n = sc.nextInt();
		for(int i =1; i<=n ; i ++) {
			System.out.print("*");
		}
  }
