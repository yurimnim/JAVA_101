import java.util.Scanner;

class DigitToKorWhile {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String []str = {"¿µ", "ÀÏ", "ÀÌ", "»ï", "»ç", "¿À", "À°", "Ä¥", "ÆÈ", "±¸"};
	
		int input;	while (true) {
		System.out.println("0~9»çÀÌÀÇ ¼ö¸¦ ÀÔ·Â: ");
		input = sc.nextInt();
			if (input >= 0 && input <= 9) {
				break;
			}
		}

		String kor = str[input];
		System.out.println(kor);
	}
}
