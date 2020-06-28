import java.util.Scanner;

class AverageScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[5];
		int input;

		for( int i = 0; i < score.length; i++) {
			System.out.println("성적을 입력하시오" );
			input = sc.nextInt();	
			input = score[i];
		}

		int sum = 0;

		for (int i = 0; i <= score.length; i ++ ){
			sum = sum + score[i];
		}
	
		System.out.println("총 점수는 " + sum + "평균점수: " + sum/score.length);
	}
}
