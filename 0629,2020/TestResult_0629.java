//5�� �л��� ������ ������ �Է¹޾�
//������ ��� ������ �����Ͽ� ���

import java.util.Scanner;

class TestResult_0629 {
	
	public static double getAverage(double[][] a) {
		
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[5];
		double [][] score = new double [3][5]; 

		// �̸��Է�
		for (int i = 0; i < name.length ; i++ ) {
			System.out.println("�̸��� �Է��Ͻÿ�.");
			name[i] = next();
		}
		
		//�����Է�
		String[] subject = {����, ����, ����};

		for (int i = 0; i < score.length ; i++ ){
				for (int j = 0; i < score[i].length ; ) {
					System.out.println( name[i] + "�л��� " + subject[i] + " ������ �Է��Ͻÿ�");
					  score [i][j] = nextDouble();
					  if (score[i][j] < 0) {
						  System.out.println("������ ������ �� �� �����ϴ�! �ٽ� �ѹ� Ȯ���ϼ���!");
					  }
					  j++ 
				}
		}

	} // main
} // class
