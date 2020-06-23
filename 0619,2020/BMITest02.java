//쌤이하신거

import java.util.Scanner;

class BMITest02 {
	
	public static void main(String[] args) {

		double weight, height;
		String name;

		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력하십시오: ");
		name = sc.next();

		System.out.println("키를 입력하십시오: cm");
		height = sc.nextDouble();

		if (height < 0) {
			System.out.println("잘못된 입력입니다.");
			return;
		}	

		System.out.println("몸무게를 입력하십시오: kg");
		weight = sc.nextDouble();

		if (weight < 0) {
			System.out.println("잘못된 입력입니다.");
			return;
		}	
		
		double s_weight = (height - 100) * 0.9;
		double min = s_weight - 0.5;
		double max = s_weight + 0.5;

		String result = "";

		if (weight  >=  min && weight <= max ) {
			 result = "표준체중";
		} else if (weight > max) {
			result = "과체중";
		} else {
			result = "저체중";
		}

		System.out.println(name + " 님의 표준체중은" + s_weight + "이고," +  result + " 입니다.");
 }
}		