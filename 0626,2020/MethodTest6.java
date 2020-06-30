class  MethodTest6{
	public static void max(int a, int b) {
		if (a < 0 || b < 0) {
			return;
		}
		int r;
		if (a > b) {
			r = a;
		} else {
			r = b;
		}
			System.out.println(a + ", " + b + " 중에 큰 수는 " + r);
			//return; 이 생략되있음
	}

	public static void main(String[] args) {
		max(-30, 31);
		int year = 2020;
		System.out.println(year);
	}
}
