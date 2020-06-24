import java.util.Scanner;

class LottoTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input;
		String result = "꽝! 다음기회에!";
		
		do {
			System.out.println("***복권*** 1~10 중의 숫자 중 하나를 입력하시오.");
			input = sc.nextInt();
			if (input >= 1 && input <=9) {
				break;
			}
		}
		while (true);
		

		switch(input){
				case 2: System.out.println("***********1등! 대박대박!! 축하드립니다!*********"); break;
				case 5: System.out.println("***********2등! 축하드립니다!*********"); break;
				case 7: System.out.println("***********3등! 축하드립니다!*********"); break;
				default : System.out.println(result); 
		}
 }
}