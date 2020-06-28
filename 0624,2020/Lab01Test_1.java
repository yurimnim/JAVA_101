import java.util.Scanner;

public class Lab01Test_1 {
  
	public static void main(String[] args) {
		int score;

		Scanner input = new Scanner(System.in);
		do{
		System.out.println("성적을 입력하시오:");
		 score = input.nextInt();
		 
		 if(score >= 0 && score <= 100) {
			break;
			}
		System.out.println("1 ~ 100 사이의 점수를 입력하십시오.");
		 } while (score < 0 || score > 100);
		
		 /*
		 	삼항연산자 이용 
			System.out.println( (score >= 60)?"합격":"불합격");

		 */

		 if (score >= 80) {
			 System.out.println("아주 우수하게 합격했습니다.");
		 } else if (score >= 70 ) {
			 System.out.println("우수하게 합격했습니다.");
		 } else if (score >= 60 ) {
			System.out.println("합격입니다.");
		 } else if (score >= 50) {
			 System.out.println("안타깝게 불합격입니다.");
		 } else {
			  System.out.println("불합격 입니다.");
		 }

		}
		
}

