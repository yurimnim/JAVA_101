import java.util.Scanner;

class BMITest {
	
	public static void main(String[] args) {
		
		int weight, height;

		Scanner sc = new Scanner(System.in);

		System.out.println("Ű�� �Է��Ͻʽÿ�: cm");
		height = sc.nextInt();
		
/*
		if (height < 0)
			System.out.println("�߸��� �Է��Դϴ�.");
			return;
	*/	
		System.out.println("�����Ը� �Է��Ͻʽÿ�: kg");
		weight = sc.nextInt();
/*
		if (weight< 0)
			System.out.println("�߸��� �Է��Դϴ�.");
			return;
*/
		/*
		��ü�� 0 ~ 18.04
		����ü�� 18.5 ~ 22.9
		 ��ü�� 23 ~ 24.9
		 �� 25 ~ 29.9
		 ���� 30~
		 */

		String result;

		double bmi = (height - 100) * 0.9;
		
		if (bmi < 18.05) 
			result = "��ü��";	
		 else if (bmi > 23) 
			result = "��ü��";
		 else 
			result = "����";

		System.out.println(result + " �Դϴ�.");

	}
}