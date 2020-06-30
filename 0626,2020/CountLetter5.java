import java.util.Scanner;

class CountLetter5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] count_lower = new int[26];
		int[] count_upper = new int[26];
		
		System.out.println("문자열을 입력하시오.");
		String buffer = scan.nextLine(); //빈칸까지 입력가능 엔터하면 끝
		
		for (int i = 0; i < buffer.length(); i++ ) {
			char ch = buffer.charAt(i);

			if (ch != ' ') {  
					if (ch >= 'a' && ch <= 'z') {
						count_lower[ch - 'a']++;
					} else {
						count_upper[ch - 'A']++;
					}
			}
		}
		for (int i = 0; i < count_upper.length; i++) {
			System.out.print( (char)('A'+i) + "==>" + count_upper[i]);
			System.out.println(", " + (char)('a'+i) + "==>" + count_lower[i]);
		}

	 }
	}
