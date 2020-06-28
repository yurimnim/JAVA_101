/*
 
 */
import java.util.Scanner;

class PrimeNumber02 {
	
	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("소수인지 판별할 숫자를 입력하시오");
		n = sc.nextInt();
		boolean isPrime = true;
		if ( n == 1) {
			System.out.println("소수가 아닙니다.");
			 return;
		}

		 //약수의 개수를 카운트 안함

		for (int i =2; i<n; i++) {
			if (n % i == 0) {
				isPrime = false;
				break; //뷁 안하면 계속 루프를 돌아버림 
			}
		}	
		if (isPrime) { 
			System.out.println("소수입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}
  }
}