import java.util.Scanner;

public class Lab01Test {
  
	public static void main(String[] args) {
		int score;

		Scanner input = new Scanner(System.in);
		do{
		System.out.println("������ �Է��Ͻÿ�:");
		 score = input.nextInt();
		 } while (score < 0 || score > 100);
		
		 /*
		 	���׿����� �̿� 
			System.out.println( (score >= 60)?"�հ�":"���հ�");

		 */

		 if (score < 50) {
			 System.out.println("���հ��Դϴ�");
		 } else if (score < 60 ) {
			 System.out.println("��Ÿ���� ���հ��Դϴ�.");
		 } else if (score < 70 ) {
			System.out.println("�հ��Դϴ�.");
		 } else if (score<80) {
			 System.out.println("����ϰ� �հ��Ͽ����ϴ�.");
		 } else {
			  System.out.println("���� ����ϰ� �հ��Ͽ����ϴ�.");
		 }

		}
		
}

