import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

class FortuneTeller02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Date today = new Date();
		int yr, mon, day, hr;


		//입력

		String outOfCriteria = "잘못된 입력입니다.";
		
		//년도입력
		System.out.println("태어난 년도를 입력하세요");
		yr = sc.nextInt();

		int currentYear = today.getYear() + 1900;
		
		if (yr < 0 || yr > currentYear) {
			System.out.println(outOfCriteria);
			return;
		}
		
		//월 입력
		System.out.println("음력 생월을 입력하세요.");
		mon = sc.nextInt();

		if (mon < 0 || mon > 13) {
			System.out.println(outOfCriteria);
			return;
		}

		
		//일 입력
		System.out.println("음력 생일을 입력하세요.");
		day = sc.nextInt();

		// 각 월 마지막 일 수 판별
		if (day < 0 || day > 31) {
			System.out.println(outOfCriteria);
			return;
		} else if (mon == 2) {
			 if (day > 28) {
				 System.out.println("2월 마지막 일은 28 혹은 29일입니다. 다시 확인한 뒤 입력하세요.");
				 return;
			 } 
		 } else if (mon == 4 || mon == 6 || mon == 9 || mon == 11) {
			 if (day > 29){
				  System.out.println("입력한 월의 마지막일은 30일 입니다. 다시 확인한 뒤 입력하세요.");
				   return;
			 }		
		 }
		
		//시 입력
		System.out.println("태어난 시를 입력하세요(예 - 오전 9시 20분: 9 / 오후 10시 40분: 20 / 오전 12시 40분: 0)");
		hr = sc.nextInt();

		if (hr < 0 || hr > 24) {
			System.out.println(outOfCriteria);
			return;
		}

		//시를 인덱스 수로 환산
		switch(hr) {
			case 23: case 0: hr = 0; break;
			case 1: case 2: hr = 1; break;
			case 3: case 4: hr = 2; break;
			case 5: case 6: hr = 3; break;
			case 7: case 8: hr = 4; break;
			case 9: case 10: hr = 5; break;
			case 11: case 12: hr = 6; break;
			case 13: case 14: hr = 7; break;
			case 15: case 16: hr = 8; break;
			case 17: case 18: hr = 9; break;
			case 19: case 20: hr = 10; break;
			case 21: case 22: hr = 11; break;																																																											
		}


		//결과 리스트

		String[] results = {"천역: 역마살-다양한 분야에 관심이 많다.", "천간: 이성에게 인기가 많다.", "천수: 기술을 배우면 좋을 팔자", "천명: 장수할 운명", "천귀: 어디서나 귀인대접을 받을 운명", "천액: 매사에 액땜할 일이 많다.", "천권: 권력욕과 야망이 많은 성격", "천파: 인생에 풍파가 많다.", "천인: 좋은 성격을 타고났다.", "천문: 비상한 머리를 타고났다.", "천복: 받을 복이 많은 팔자.","천고: 외로움을 잘타는 성격"}; //index 11개 

		//첫번째 결과출력
		int outputYr = yr % 12;
		System.out.println(results[outputYr]);

		
		//두번째 결과출력
		int monPlus = (outputYr + mon - 1) % 12;
		System.out.println(results[monPlus]);		

		//세번째 결과 출력 
		int dayPlus = (monPlus + day - 1) % 12;
		System.out.println(results[dayPlus]);

		 
		//네번째 결과 출력
		 int hrPlus = (dayPlus + hr) % 12;
		System.out.println(results[hrPlus]);
	}
}