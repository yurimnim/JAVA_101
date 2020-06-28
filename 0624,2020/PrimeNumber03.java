/*
 
 */

class PrimeNumber03 {
	
	public static void main(String[] args) {
		
		// 숫자 하나가 소수인지 판별하는 코드를 반복을 돌게 할거임
		for(int n = 2; n < 100; n++) {
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
}