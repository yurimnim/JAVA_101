// ����ڿ��� 0���� 9������ ���� �Է¹޾� 
// �ѱ� ǥ��� ����ϴ� ���α׷� �����
import java.util.Scanner;

class DigitToKor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("0~9 ������ ���� �Է�: ");
		n = sc.nextInt();
		
		if (n == 0)
		{
			System.out.println("��");
		} 
		else if (n == 1)
		{
			System.out.println("��");
		}
		else if (n == 2)
		{
			System.out.println("��");
		}
		else if (n == 3)
		{
			System.out.println("��");
		}
		
		else if (n == 4)
		{
			System.out.println("��");
		}
		else if (n == 5)
		{
			System.out.println("��");
		}
		else if (n == 6)
		{
			System.out.println("��");
		}
		else if (n == 7)
		{
			System.out.println("ĥ");
		}
		else if (n == 8)
		{
			System.out.println("��");
		}
		else if (n == 9)
		{
			System.out.println("��");
		}
		else 
		{
			System.out.println("�߸��� �Է°� �Դϴ�!");
		}

	}
}