import java.util.Scanner;

class CountLetter2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] count = new int[26];

		System.out.println("���̸� �Է��ϼ���.");
		int age = scan.nextInt();

		scan.nextLine();
	
		System.out.println("���ڿ��� �Է��Ͻÿ�.");
		String buffer = scan.nextLine(); //��ĭ���� �Է°��� �����ϸ� ��
		//System.out.println(buffer);

		

		System.out.println("�Է��� ����: " + buffer);
		System.out.println("����: " + age);
	
	}
}
