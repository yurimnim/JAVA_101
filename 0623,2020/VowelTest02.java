import java.util.Scanner;

class VowelTest02 {
		public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input;

		String result = "";

		System.out.println("***알파벳 자음/모음 테스터!***");
		
		do {	
			System.out.println("알파벳 한글자를 입력하시오.");
			input = sc.next();
			
			/*
				if (input.length() == 1 {
					break;
				}
				*/ 
		} while(input.length() != 1); 
		
		
	
		switch(input){
				case "a": case "e": case "i": case "o":  case "u":  result = "모음"; break;
				default: result = "자음";
		}

		System.out.println(input + " 은(는) " + result + " 입니다.");
		}
 }