import java.util.Scanner;

class DigitToKorWhile {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String []str = {"��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��"};
	
		int input;	while (true) {
		System.out.println("0~9������ ���� �Է�: ");
		input = sc.nextInt();
			if (input >= 0 && input <= 9) {
				break;
			}
		}

		String kor = str[input];
		System.out.println(kor);
	}
}
