//1 부터 45까지 숫자 6개를 배열에 담아보자
//데이터가 중복되지 않도록 제거 

import java.util.Random;

class LottoTest03 {
	public static void main(String[] args) {
		
		Random rand = new Random();

		int []a = new int[6];

		for(int i = 0; i < 6; ) {
				int n = rand.nextInt(45) + 1; // rand.nextInt(46) 하면 0도 나오지!!!!
				//이미 배열에 있으면 아래로 내려가지 않게하기 (continue)
				boolean flag = false;
				for(int j = 0; j < i; j++) { 
					if (a[j] == n ) {
						flag = true;
						break;
					} 
				}
				if (flag == true) {
					continue; // 같은 숫자면 아래 증감식을 실행하지 않음 
				}
				a[i] = n;
				i ++;
		}

		//값이 작은거부터 큰거 순서대로 오도록 정렬 오름차순 정렬
		for (int i = 0; i < 6; i++ ) {
			for (int j = i + 1; j < 6; j++ ){
				if( a[j] < a[i] ) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
			}
		 }
		}

		System.out.println("축하합니다. 당첨번호!!!  ");
		for (int i = 0; i < 6 ; i++ ) {
			System.out.print(a[i] + "  ");
		}
	
 }
}