import java.util.Scanner;

class VowelTest02 {
		public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input;

		String result = "";

		System.out.println("***���ĺ� ����/���� �׽���!***");
		
		do {	
			System.out.println("���ĺ� �ѱ��ڸ� �Է��Ͻÿ�.");
			input = sc.next();
			
			/*
				if (input.length() == 1 {
					break;
				}
				*/ 
		} while(input.length() != 1); 
		
		
	
		switch(input){
				case "a": case "e": case "i": case "o":  case "u":  result = "����"; break;
				default: result = "����";
		}

		System.out.println(input + " ��(��) " + result + " �Դϴ�.");
		}
 }