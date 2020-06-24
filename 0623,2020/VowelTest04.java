import java.util.Scanner;

class VowelTest04 {

	//영어인지 아닌지 판별하는 메소드 만들기 
	public static boolean isEnglish(char ch) {
		boolean r = false;
		if ( ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z'  ) {
			r = true;
		}
		return r;
	} 

		public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input;

		String result = "자음";

		System.out.println("***알파벳 자음/모음 테스터!***");
		
		do {	
			System.out.println("알파벳 한글자를 입력하시오.");
			input = sc.next();
			
			//입력된 문자가 1글자이고 알파벳이면 탈출
			char ch = input.charAt(0);
			if(isEnglish(ch) && input.length() == 1) 
				break;
		} while(true); 

		input = input.toLowerCase();
		
		switch(input){
				//case "A": case "E": case "I": case "O": case"U": result = "모음"; break;
				case "a": case "e": case "i": case "o":  case "u": result = "모음"; break;
		}

		System.out.println(input + " 은(는) " + result + " 입니다.");
		}
 }