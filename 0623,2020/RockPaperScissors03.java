import java.util.Scanner;
import java.util.Random;

class RockPaperScissors03 {
	public static void main(String[] args) {
		String[] str = {"����", "����", "��"};
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		int com = rand.nextInt(3);
		int user;
		System.out.println("***** ���� ���� �� ����!^o^ *****");
		System.out.println("�����ϼ���==> 0:����, 1:����, 2:�� ");
		user = sc.nextInt();

		System.out.println("����ڴ� " +  str[user] + " ��(��) �½��ϴ�.");
		System.out.println("��ǻ�ʹ� " +  str[com] + " ��(��) �½��ϴ�.");

	}
}
