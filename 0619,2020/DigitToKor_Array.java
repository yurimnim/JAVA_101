import java.util.Scanner;
import java.util.ArrayList;

class DigitToKor_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input;

		System.out.println("0~99 ������ ���� �Է�: ");
		input = sc.nextInt();

		String convert = "";
		String ten = "��";
		int mod = input % 10;
		int div = input/10;
		
		if(input < 0 || input > 99) 
			System.out.println("�߸��� �Է��Դϴ�.");
			return;

		String[] Kor = {" ", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��"};
			
			if (input < 10) 
				convert = Kor[input];
			else if (input > 10 && input < 20) 
				convert = ten + Kor[mod];
			else if (input > 19 && input < 100) 
				convert = Kor[div] + ten + Kor[mod];
			else if (input == 0)
				convert = "��";
			else 
				convert = "��";
		
		System.out.println(convert);

	}
  }

		