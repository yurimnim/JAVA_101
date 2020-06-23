//사용자에게 0~99 까지의 숫자를 받아서 한글표기 하는 프로그램 작성
import java.util.Scanner

class NoKor {

	public static void main (String[] args) {
			Scanner sc = new Scanner(System.in);
			int input;
			String kor = "";
			
			System.out.println("숫자입력: ");
			input = nextInt();

			if (input < 0 || input > 99)
				System.out.println("잘못된 입력입니다.");
			
	
	}
}