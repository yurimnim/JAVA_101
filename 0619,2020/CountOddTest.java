//1에서 10까지 홀수는 모두 몇개인지 판별해서 출력

class  CountOddTest {
	public static void main(String[] args) {

		int sum = 0;
			
		for(int i = 1 ; i <= 10 ; i = i+1 ) {
			if (i % 2 ==1) {
				sum++; // sum = sum + 1
			}	
		}
		
		System.out.println(sum);	
  }
}