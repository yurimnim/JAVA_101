import java.util.Scanner;

class AlphabetTest {
		public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input;
		String result = "자음";

		System.out.println("알파벳 한글자를 입력하시오.");
		input = sc.next();

		switch(input){
		case "a": case "e": case "i" case "o": case "y": case "u": result = "모음"; break;
		}

		System.out.println(input + " 은(는) " + result + " 입니다.");

		}
 }
}