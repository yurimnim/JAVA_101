// 사용자에게 몇월인지 입력받아 계절명 출력 
//Switch 문 이용해서 작성 
import java.util.Scanner;

class SeasonTestSwitch03 {
	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		int season; 
		String str = "";

		System.out.println("월을 입력하세요.");
		season = sc.nextInt();

		if (season < 1 || season > 12 ) {
			System.out.println("잘못된 값 입니다.");
			return;
		}

		switch (season)
		{
		case 3: case 4: case 5: str = "봄"; break;
		case 6: case 7: case 8: str = "여름"; break;
		case 9: case 10: case 11: str = "가을"; break;
		default: str = "겨울"; break;
		}
		System.out.println(season + "월은 " + str + " 입니다.");
  }
}	
