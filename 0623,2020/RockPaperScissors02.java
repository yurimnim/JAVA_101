// 무작위 수를 난수라고 한다.
import java.util.Scanner;
import java.util.Random;

class RockPaperScissors02 {
	public static void main(String[] args) {
		String[] str = {"가위", "바위", "보"};
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		int com = rand.nextInt(3);
		System.out.println(com);

		System.out.println("컴퓨터는 " +  str[com] + " 를(을) 냈습니다.");

	}
}
