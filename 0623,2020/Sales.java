import java.util.Scanner;

class Sales {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int item; 
		int price = 100;
		int totalPrice = 0;
		String discount = " ";
		
		System.out.println("***100�� ����!! 10�� �̻� ���� 10% �������!!***");
		System.out.println("�� ���� ���� �Ͻðڽ��ϱ�?");
		item = sc.nextInt();

		if (item >= 10){
			discount = " 10% ���ε� �������� ";
			totalPrice = (int)(price * item * 0.9);
		} else {
			totalPrice = price * item;		
		}
		
		System.out.println("�� ������" +  discount + totalPrice + "�� �Դϴ�.");

	}
}
