import java.util.Scanner;

class AverageScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[5];
		int input;

		for( int i = 0; i < score.length; i++) {
			System.out.println("������ �Է��Ͻÿ�" );
			input = sc.nextInt();	
			input = score[i];
		}

		int sum = 0;

		for (int i = 0; i <= score.length; i ++ ){
			sum = sum + score[i];
		}
	
		System.out.println("�� ������ " + sum + "�������: " + sum/score.length);
	}
}
