import java.util.Scanner;

class Sales {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int item; 
		int price = 100;
		int totalPrice = 0;
		String discount = " ";
		
		System.out.println("***100냥 장터!! 10개 이상 구입 10% 할인행사!!***");
		System.out.println("몇 개를 구입 하시겠습니까?");
		item = sc.nextInt();

		if (item >= 10){
			discount = " 10% 할인된 가격으로 ";
			totalPrice = (int)(price * item * 0.9);
		} else {
			totalPrice = price * item;		
		}
		
		System.out.println("총 가격은" +  discount + totalPrice + "원 입니다.");

	}
}
