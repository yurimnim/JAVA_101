// ������ ���� ������� �Ѵ�.
import java.util.Scanner;
import java.util.Random;

class RockPaperScissors02 {
	public static void main(String[] args) {
		String[] str = {"����", "����", "��"};
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		int com = rand.nextInt(3);
		System.out.println(com);

		System.out.println("��ǻ�ʹ� " +  str[com] + " ��(��) �½��ϴ�.");

	}
}
