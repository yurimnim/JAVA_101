import java.util.Scanner;

class  CreditCard{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[12];
		double total = 0;

		for (int i = 0; i < arr.length;) {
			System.out.print( (i+1) + "�� ī����ݾ��� �Է��Ͻÿ� ==>");
			arr[i] = sc.nextDouble();
			if (arr[i] < 0) {
				System.out.println("ī�� ���ݾ��� ������ �� �� �����ϴ�.");
				continue;
			}
			total += arr[i];
			i++;						
		}
		// ���� ������ ���ų� ������ ���� �ϳ� �̻��� ���� ���� 
		double max = arr[0];
		double min = arr[0];

		for (int i = 1;i <arr.length ; i++ ) {
			if (arr[i] > max){
				max = arr[i];
			} 

			if(arr[i] < min) {
				min = arr[i];
			}
		}

			System.out.println(); //�ٹٲ�
			System.out.println("1�� ���� ��ü ���ݾ�::" + total);
			System.out.println("��� ���ݾ�::" + (total/12));
			System.out.print("���� ������ ���Ҵ� ��:: " );


			for (int i = 0;i <arr.length; i++ ){
				if (arr[i] == max) {
					System.out.print(i + 1 + " ");
				}
			}

			System.out.println(); //�ٹٲ� 
			System.out.print("���� ������ ������ ��:: ");
			for (int i = 0;i <arr.length; i++ ){
				if (arr[i] == min) {
					System.out.print(i + 1 + " ");
				}
			}
	}
}
