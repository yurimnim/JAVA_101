import java.util.Scanner;

class CountLetter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] count = new int[26];
		System.out.println("문자열을 입력하시오.");
		String buffer = scan.nextLine(); //빈칸까지 입력가능 엔터하면 끝
		
		for (int i = 0; i < buffer.length(); i++ ){
			char ch = buffer.charAt(i);
			if (ch != ' ') { //공백에 대한 처리 
				//System.out.println("|" + ch + "|"); 
				count[ch - 'a']++;
			}
		}

		for (int i = 0; i < count.length; i++) {
			System.out.println( (char)('a'+i) + "==>" + count[i]);
		}

	}
}
