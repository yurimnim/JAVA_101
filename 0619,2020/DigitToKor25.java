import java.util.Scanner;
import java.util.ArrayList;

class DigitToKor25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input;

		System.out.println("0~99 사이의 수를 입력: ");
		input = sc.nextInt();

		String convert = "";
		String ten = "십";
		int mod = input % 10;
		int div = input/10;

		String[] Kor = {" ", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};

		for (int i = 0; i < 100; i++)
		{
			if (i < 10)
			{
				convert = Kor[i];
			}
			else if (i > 10 && i < 20)
			{
				convert = ten + Kor[mod];
			}
			else if (i > 19 && i < 100)
			{
				convert = Kor[div] + ten + Kor[mod];
			} 
			else if (i == 0)
			{
				convert = "영";
			}
			else
			{
				convert = "십";
			}	
		}
		System.out.println(convert);

	}
}