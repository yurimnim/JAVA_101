//����ڿ��� �ΰ��� ������ �Է¹޾� �� �߿� ū ���� ã�� ����ϴ� ���α׷��� �ۼ� 
// ���׿����ڸ� �̿� 
import java.util.Scanner;

class MaxTest {

	public static void main(String[] args) {
		
		int a,b,max;
		Scanner sc = new Scanner(System.in);

		System.out.println(" ù��° �� �Է�: ");
		a = sc.nextInt();
		
		System.out.println(" �ι�° �� �Է�: ");
		b = sc.nextInt();
	
	   max = (a>b)?a:b;

	   System.out.println(max + " �� �� ũ��.");
		
	}
}