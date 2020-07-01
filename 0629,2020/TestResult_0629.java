//5명 학생의 국영수 점수를 입력받아
//총점과 평균 구한후 정렬하여 출력

import java.util.Scanner;

class TestResult_0629 {
	
	public static double getAverage(double[][] a) {
		
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[5];
		double [][] score = new double [3][5]; 

		// 이름입력
		for (int i = 0; i < name.length ; i++ ) {
			System.out.println("이름을 입력하시오.");
			name[i] = next();
		}
		
		//점수입력
		String[] subject = {국어, 영어, 수학};

		for (int i = 0; i < score.length ; i++ ){
				for (int j = 0; i < score[i].length ; ) {
					System.out.println( name[i] + "학생의 " + subject[i] + " 점수를 입력하시오");
					  score [i][j] = nextDouble();
					  if (score[i][j] < 0) {
						  System.out.println("점수는 음수가 될 수 없습니다! 다시 한번 확인하세요!");
					  }
					  j++ 
				}
		}

	} // main
} // class
