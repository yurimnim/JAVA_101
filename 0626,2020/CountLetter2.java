import java.util.Scanner;

class CountLetter2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] count = new int[26];

		System.out.println("나이를 입력하세요.");
		int age = scan.nextInt();

		scan.nextLine();
	
		System.out.println("문자열을 입력하시오.");
		String buffer = scan.nextLine(); //빈칸까지 입력가능 엔터하면 끝
		//System.out.println(buffer);

		

		System.out.println("입력한 문장: " + buffer);
		System.out.println("나이: " + age);
	
	}
}
