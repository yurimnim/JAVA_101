import java.util.Scanner;

class CountLetter5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] count_lower = new int[26];
		int[] count_upper = new int[26];
		
		System.out.println("���ڿ��� �Է��Ͻÿ�.");
		String buffer = scan.nextLine(); //��ĭ���� �Է°��� �����ϸ� ��
		
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
