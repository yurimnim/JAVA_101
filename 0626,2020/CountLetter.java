import java.util.Scanner;

class CountLetter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] count = new int[26];
		System.out.println("���ڿ��� �Է��Ͻÿ�.");
		String buffer = scan.nextLine(); //��ĭ���� �Է°��� �����ϸ� ��
		
		for (int i = 0; i < buffer.length(); i++ ){
			char ch = buffer.charAt(i);
			if (ch != ' ') { //���鿡 ���� ó�� 
				//System.out.println("|" + ch + "|"); 
				count[ch - 'a']++;
			}
		}

		for (int i = 0; i < count.length; i++) {
			System.out.println( (char)('a'+i) + "==>" + count[i]);
		}

	}
}
