/*
 사용자에게 숫자하나를 입력받아 소수인지 판별하는 프로그램 
 소수: 1과 자기자신으로만 나눠지는 수 약수의 개수가 2개인 수 
*/
import java.util.Scanner;

class PrimeNumber01 {
	
	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("소수인지 판별할 숫자를 입력하시오");
		n = sc.nextInt();
		
		int count = 0; //약수의 개수를 담을 변수 

		for (int i =1; i<=n; i++) {
			if (n % i == 0) {
				count = count + 1;
			}
		}

		if (count == 2) {
			System.out.println(n + " 은 소수입니다.");
		} else {
			System.out.println(n + " 은 소수가 아닙니다.");
		}
  }
}