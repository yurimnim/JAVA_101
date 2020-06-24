/*
	 java AreaTest2 R
	 �簢���� ���α���? 2
	 �簢���� ���α���? 3
	 �簢���� ������ ___
*/
import java.util.Scanner;

class AreaTest02 {
	public static void main(String[] args) {
		String type = args[0];
		if (args.length != 1) {
			System.out.println("�������� �Է¿���");
			return;
		}
		if (!type.equals("T") && !type.equals("R") && !type.equals("S")) {
			System.out.println("�������� �Է¿���: R/T/S  �߿� �ϳ��� �Է��Ͻÿ�.");
			return;
		}
		
		Scanner sc = new Scanner(System.in);
		
		
		String typeResult = "";
		double width, height, area = 0, radius;
		switch (type){
			case "R" :
				typeResult = "�簢��";
				System.out.println("�簢���� ���α���");
				width = sc.nextDouble();
				System.out.println("�簢���� ���α���");
				height = sc.nextDouble();
				area = width*height;
				break;
			case "T" :
				typeResult = "�ﰢ��";
				System.out.println("�ﰢ���� ���α���");
				width = sc.nextDouble();
				System.out.println("�ﰢ���� ���α���");
				height = sc.nextDouble();
				area = width*height*1/2;
				break;
			case "S" :
				typeResult = "��";
				System.out.println("�� �������� ����:");
				 radius = sc.nextDouble();
				 area = radius*radius *3.14;
			}				
		System.out.println(typeResult + "�� ����: " + area);
 }
}