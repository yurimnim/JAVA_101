class ContinueTest {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i ++) {
			if (i % 5 == 0) {
				continue; // 이 조건이 맞으면 다음 조건식을 실행하지 않기 (pass 하기) 
			}
			System.out.print(i);
		}
		System.out.println("작업종료!");
	}
}