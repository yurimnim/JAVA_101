//�����ϽŰ�

import java.util.Scanner;

class BMITest02 {
	
	public static void main(String[] args) {

		double weight, height;
		String name;

		Scanner sc = new Scanner(System.in);

		System.out.println("�̸��� �Է��Ͻʽÿ�: ");
		name = sc.next();

		System.out.println("Ű�� �Է��Ͻʽÿ�: cm");
		height = sc.nextDouble();

		if (height < 0) {
			System.out.println("�߸��� �Է��Դϴ�.");
			return;
		}	

		System.out.println("�����Ը� �Է��Ͻʽÿ�: kg");
		weight = sc.nextDouble();

		if (weight < 0) {
			System.out.println("�߸��� �Է��Դϴ�.");
			return;
		}	
		
		double s_weight = (height - 100) * 0.9;
		double min = s_weight - 0.5;
		double max = s_weight + 0.5;

		String result = "";

		if (weight  >=  min && weight <= max ) {
			 result = "ǥ��ü��";
		} else if (weight > max) {
			result = "��ü��";
		} else {
			result = "��ü��";
		}

		System.out.println(name + " ���� ǥ��ü����" + s_weight + "�̰�," +  result + " �Դϴ�.");
 }
}		