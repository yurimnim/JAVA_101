import java.util.Scanner;

class  CreditCard{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[12];
		double total = 0;

		for (int i = 0; i < arr.length;) {
			System.out.print( (i+1) + "월 카드사용금액을 입력하시오 ==>");
			arr[i] = sc.nextDouble();
			if (arr[i] < 0) {
				System.out.println("카드 사용금액은 음수가 될 수 없습니다.");
				continue;
			}
			total += arr[i];
			i++;						
		}
		// 가장 지출이 많거나 적었던 월이 하나 이상일 수도 있음 
		double max = arr[0];
		double min = arr[0];

		for (int i = 1;i <arr.length ; i++ ) {
			if (arr[i] > max){
				max = arr[i];
			} 

			if(arr[i] < min) {
				min = arr[i];
			}
		}

			System.out.println(); //줄바꿈
			System.out.println("1년 동안 전체 사용금액::" + total);
			System.out.println("평균 사용금액::" + (total/12));
			System.out.print("가장 지출이 많았던 월:: " );


			for (int i = 0;i <arr.length; i++ ){
				if (arr[i] == max) {
					System.out.print(i + 1 + " ");
				}
			}

			System.out.println(); //줄바꿈 
			System.out.print("가장 지출이 적었던 월:: ");
			for (int i = 0;i <arr.length; i++ ){
				if (arr[i] == min) {
					System.out.print(i + 1 + " ");
				}
			}
	}
}
