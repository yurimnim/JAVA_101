import java.util.Scanner;
import java.util.ArrayList;

class DigitToKor25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input;

		System.out.println("0~99 ������ ���� �Է�: ");
		input = sc.nextInt();

		String convert = "";
		String ten = "��";
		int mod = input % 10;
		int div = input/10;

		String[] Kor = {" ", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��"};

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
				convert = "��";
			}
			else
			{
				convert = "��";
			}	
		}
		System.out.println(convert);

	}
}