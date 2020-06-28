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
			System.out.print("정답을 추측하여 보시오 : ");
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

		System.out.println("축하합니다!");
		System.out.println("시도횟수는 "+ cnt +"입니다.");
	}
}
