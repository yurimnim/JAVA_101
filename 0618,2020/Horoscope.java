import java.util.Scanner;


class Horoscope {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int month, day; 
		String horoscope = "염소자리";


		System.out.println("태어난 월: ");
		month = sc.nextInt();

		System.out.println("태어난 달: ");
		day = sc.nextInt();

		if (month > 12 || month < 0 || day > 30 || day < 0) {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		
		if (month == 1) {
			if (day > 19)	
			    horoscope = "물병자리";
		} else if (month == 2) {
			if (day < 21)
				horoscope = "물병자리";
			else 
				horoscope = "물고기자리";
		} else if (month == 3) {
			if (day < 20)
				horoscope = "물고기자리";
			else 
				horoscope = "양자리";
		} else if (month == 4) {
			if (day < 22)
				horoscope = "양자리";
			else 
				horoscope = "황소자리";
		} else if (month == 5) {
			if (day < 21)
				horoscope = "황소자리";
			else 
				horoscope = "쌍둥이자리";
		} else if (month == 6) {
			if (day < 22)
				horoscope = "쌍둥이자리";
			else 
				horoscope = "게자리";			
		} else if (month == 7) { 
			if (day < 23)
				horoscope = "게자리";
			else 
				horoscope = "사자자리";
		} else if (month == 8) {
			if (day < 24) 
				horoscope = "사자자리";
			else 
				horoscope = "처녀자리";
		} else if (month == 9) {
			if (day < 24)
				horoscope = "처녀자리";
			else 
				horoscope = "천칭자리";
		} else if (month == 10) {
			if (day < 25)
				horoscope = "천칭자리";
			else
				horoscope = "전갈자리";		
		} else if (month == 11) {
			if (day < 21)
				horoscope = "전갈자리";
			else
				horoscope = "사수자리";
		} else if (month == 12) {
			if (day < 25)
				horoscope = "사수자리";
		}

		System.out.println("당신의 별자리는 " + horoscope + "입니다.");
	}
	
}