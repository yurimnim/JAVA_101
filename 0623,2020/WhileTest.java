class WhileTest {
	public static void main(String[] args) {
		
		int i = 0, sum = 0;

		while (i < 10) {
			i++; // 0 1 2 3 4 5 6 7 8 9 테스트 
			if(i % 3 == 0) continue; // 3의 배수면 처음으로 돌아가서 다시 반복문 실행 
			System.out.println(i); // 3의 배수가 아니면 프린트 

			sum += i; // sum = sum + i //i 값 계속 누적
			if (sum > 20) break;  //누적해서 더한 i 값이 20보다 클 때 탈출 
		
		}

			System.out.println("sum 값이 " + sum + "일때 탈출");
			System.out.println("i 값이 " + i + " 일때 탈출");
  }
}