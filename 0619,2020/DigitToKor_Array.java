import java.util.Scanner;
import java.util.ArrayList;

class DigitToKor_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input;

		System.out.println("0~99 사이의 수를 입력: ");
		input = sc.nextInt();

		String convert = "";
		String ten = "십";
		int mod = input % 10;
		int div = input/10;
		
		if(input < 0 || input > 99) 
			System.out.println("잘못된 입력입니다.");
			return;

		String[] Kor = {" ", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
			
			if (input < 10) 
				convert = Kor[input];
			else if (input > 10 && input < 20) 
				convert = ten + Kor[mod];
			else if (input > 19 && input < 100) 
				convert = Kor[div] + ten + Kor[mod];
			else if (input == 0)
				convert = "영";
			else 
				convert = "십";
		
		System.out.println(convert);

	}
  }

		