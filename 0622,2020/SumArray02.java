
class  SumArray02 {
	public static void main(String[] args) {

		int []arr = {36, 33, 28, 26, 31}; // 배열
		int sum = 0;
		
		//for each 반복문 
		//오른쪽엔 배열이름, 그 배열 안에 있는걸 꺼내올 변수(배열 안에 data)
		for (int i : arr ) {
			sum = sum + i;
		}
		System.out.println("홍두깨팀 나이의 총합은 " + sum);
  }
 }
