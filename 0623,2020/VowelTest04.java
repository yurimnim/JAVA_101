import java.util.Scanner;

class VowelTest04 {

	//�������� �ƴ��� �Ǻ��ϴ� �޼ҵ� ����� 
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

		String result = "����";

		System.out.println("***���ĺ� ����/���� �׽���!***");
		
		do {	
			System.out.println("���ĺ� �ѱ��ڸ� �Է��Ͻÿ�.");
			input = sc.next();
			
			//�Էµ� ���ڰ� 1�����̰� ���ĺ��̸� Ż��
			char ch = input.charAt(0);
			if(isEnglish(ch) && input.length() == 1) 
				break;
		} while(true); 

		input = input.toLowerCase();
		
		switch(input){
				//case "A": case "E": case "I": case "O": case"U": result = "����"; break;
				case "a": case "e": case "i": case "o":  case "u": result = "����"; break;
		}

		System.out.println(input + " ��(��) " + result + " �Դϴ�.");
		}
 }