class ShortcutOperation {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 7; 
		if (a > 10 & ++b > 10)
			System.out.println("모두 10보다 큽니다.");
		else 
			System.out.println("10보다 크지 않습니다.");

		System.out.println(b);
	}
}

// && : 앞전에 이미  false 가 나오면 뒤는 처리도 안함 (shortcut operation)
// &: 앞전이 false 라 해도 뒤의 것까지 계산 및 처리 함


