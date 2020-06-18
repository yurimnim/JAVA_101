// 사용자에게 몇월인지 입력받아 계절명 출력 
//Switch 문 이용해서 작성 
import java.util.Scanner;

class SeasonTestSwitch {
	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		int season; 
		
		System.out.println("월을 입력하세요.");
		season = sc.nextInt();

		switch (season)
		{
		case 3: case 4: case 5: 
			System.out.println(season + "월은 봄");break;
 
		case 6: case 7: case 8: 
			System.out.println(season + "월은 여름 ");break;
		
		case 9: case 10: case 11: 
			System.out.println(season + "월은 가을 ");break;

		case 12: case 1: case 2: 
			System.out.println(season + "월은 겨울  ");break;

		default:
			System.out.println("잘못된 월 입력 ");break;	
		}
  }
}	
