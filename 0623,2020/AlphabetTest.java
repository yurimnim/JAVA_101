import java.util.Scanner;

class AlphabetTest {
		public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input;
		String result = "����";

		System.out.println("���ĺ� �ѱ��ڸ� �Է��Ͻÿ�.");
		input = sc.next();

		switch(input){
		case "a": case "e": case "i" case "o": case "y": case "u": result = "����"; break;
		}

		System.out.println(input + " ��(��) " + result + " �Դϴ�.");

		}
 }
}