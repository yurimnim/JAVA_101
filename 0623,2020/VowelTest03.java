import java.util.Scanner;

class VowelTest03 {
		public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input;

		String result = "����";

		System.out.println("***���ĺ� ����/���� �׽���!***");
		
		do {	
			System.out.println("���ĺ� �ѱ��ڸ� �Է��Ͻÿ�.");
			input = sc.next();
			
			//�Էµ� ���ڰ� 1�����̰� ���ĺ��̸� Ż��
			char ch = input.charAt(0);
			/*
			if ( ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch<='z')) && input.length() != 1) {
					break;
			}
			*/
		} while(true); 
		
		
	
		switch(input){
				case "A": case "E": case "I": case "O": case"U": result = "����"; break;
				case "a": case "e": case "i": case "o":  case "u": result = "����"; break;
		}

		System.out.println(input + " ��(��) " + result + " �Դϴ�.");
		}
 }