import java.util.Scanner;
import java.util.Random;
class RandomTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int answer = rand.nextInt(101);
		// System.out.println(answer);
		int cnt=0;
		int guess;

		do
		{
			System.out.print("������ �����Ͽ� ���ÿ� : ");
			guess = sc.nextInt();
			cnt++;
			if (guess>answer) {
				System.out.println("HIGH");
			} else if (guess<answer) {
				System.out.println("LOW");
			} else {
				break;
			}
		}
		while (guess!=answer);

		System.out.println("�����մϴ�!");
		System.out.println("�õ�Ƚ���� "+ cnt +"�Դϴ�.");
	}
}
