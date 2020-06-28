//1 부터 45까지 숫자 6개를 배열에 담아보자
class LottoTest02 {
	public static void main(String[] args) {
		
		int []a; 
		a = new int[6]; //배열의 크기 
		a[0] = 15;
		a[1] = 7;
		a[2] = 23;
		a[3] = 27;
		a[4] = 17;
		a[5] = 11;
		
		for(int i = 0; i < 6; i++) {
			System.out.print(a[i] + "  ");
		}

	}
}
