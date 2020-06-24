// 무작위 수를 난수라고 한다.
import java.util.Scanner;
import java.util.Random;

class RockPaperScissors{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		int com = rand.nextInt();
		System.out.println(com);

		if (com < 0) {
			com = com * -1;
		} 
		com = com % 3;
		System.out.println(com);

	}
}
