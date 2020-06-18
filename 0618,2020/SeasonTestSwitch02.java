// 사용자에게 몇월인지 입력받아 계절명 출력 
//Switch 문 이용해서 작성 
import java.util.Scanner;

class SeasonTestSwitch02 {
	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		int season; 
		String str = "";

		System.out.println("월을 입력하세요.");
		season = sc.nextInt();

		switch (season)
		{
		case 3: case 4: case 5: str = "봄"; break;
		case 6: case 7: case 8: str = "여름"; break;
		case 9: case 10: case 11: str = "가을"; break;
		case 12: case 1: case 2: str = "겨울"; break;
		}
		System.out.println(season + "월은 " + str + " 입니다.");
  }
}	
