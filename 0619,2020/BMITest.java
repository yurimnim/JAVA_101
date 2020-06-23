import java.util.Scanner;

class BMITest {
	
	public static void main(String[] args) {
		
		int weight, height;

		Scanner sc = new Scanner(System.in);

		System.out.println("키를 입력하십시오: cm");
		height = sc.nextInt();
		
/*
		if (height < 0)
			System.out.println("잘못된 입력입니다.");
			return;
	*/	
		System.out.println("몸무게를 입력하십시오: kg");
		weight = sc.nextInt();
/*
		if (weight< 0)
			System.out.println("잘못된 입력입니다.");
			return;
*/
		/*
		저체중 0 ~ 18.04
		정상체중 18.5 ~ 22.9
		 과체중 23 ~ 24.9
		 비만 25 ~ 29.9
		 고도비만 30~
		 */

		String result;

		double bmi = (height - 100) * 0.9;
		
		if (bmi < 18.05) 
			result = "저체중";	
		 else if (bmi > 23) 
			result = "과체중";
		 else 
			result = "정상";

		System.out.println(result + " 입니다.");

	}
}