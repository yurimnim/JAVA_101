import java.util.Scanner;
import java.util.Random;

class RockPaperScissors04 {
	public static void main(String[] args) {
		String[] str = {"가위", "바위", "보"};
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		int com = rand.nextInt(3);
		int user;
		System.out.println("***** 가위 바위 보 게임!^o^ *****");
		System.out.println("선택하세요==> 0:가위, 1:바위, 2:보 ");
		user = sc.nextInt();

		System.out.println("사용자는 " +  str[user] + " 를(을) 냈습니다.");
		System.out.println("컴퓨터는 " +  str[com] + " 를(을) 냈습니다.");
		
		if (com == user) {
			System.out.println("비겼다!");
		} else if (user == 0 && com == 2 || user == 1 && com == 0 || user == 2 && com == 1) {
			System.out.println("이겼다 ^0^");
		} else {
			System.out.println("졌다 ㅜㅜ");
		}
	}
}
