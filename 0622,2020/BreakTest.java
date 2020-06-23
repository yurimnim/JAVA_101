class BreakTest {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i ++) {
			if (i % 5 == 0) {
				break;// if 조건식 안에 조건이 맞으면  for 문 탈출
			}
			System.out.println(i);
		}
		System.out.println("작업종료!");
	}
}