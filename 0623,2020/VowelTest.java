//import java.util.Scanner;

class VowelTest {
		public static void main(String[] args) {

		//Scanner sc = new Scanner(System.in);
		//String input;

		String input = args[0];

		if (args.length > 1) {
			System.out.println("�Է¿��� :  ���ĺ� �ѱ��ڸ� �Է��Ͻÿ�");
			return;
		}

		String result = "����";

		/*
		System.out.println("���ĺ� �ѱ��ڸ� �Է��Ͻÿ�.");
		input = sc.next();
	*/
		switch(input){
				case "a": case "e": case "i": case "o":  case "u":  result = "����"; break;
				case "A": case "E": case "I": case "O": case "U":  result = "����"; break;
		}

		System.out.println(input + " ��(��) " + result + " �Դϴ�.");
		}
 }
