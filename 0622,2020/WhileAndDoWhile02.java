class WhileAndDoWhile02 {
	public static void main(String[] args) {
		int i = 100;
		do { // 처음부터 조건에 만족하지 않아도 적어도 한번은 반복문 실행 
			System.out.println("hello");
			i++;
		} while (i<= 3);
	}
}
