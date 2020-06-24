//import java.util.Scanner;

class VowelTest {
		public static void main(String[] args) {

		//Scanner sc = new Scanner(System.in);
		//String input;

		String input = args[0];

		if (args.length > 1) {
			System.out.println("입력오류 :  알파벳 한글자만 입력하시오");
			return;
		}

		String result = "자음";

		/*
		System.out.println("알파벳 한글자를 입력하시오.");
		input = sc.next();
	*/
		switch(input){
				case "a": case "e": case "i": case "o":  case "u":  result = "모음"; break;
				case "A": case "E": case "I": case "O": case "U":  result = "모음"; break;
		}

		System.out.println(input + " 은(는) " + result + " 입니다.");
		}
 }
