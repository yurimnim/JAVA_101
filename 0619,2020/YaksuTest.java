/*
	��������� N�� �Է¹޾� N�� ����� 
	��� ����ϴ� ���α׷��� �ۼ��մϴ�.
*/
import java.util.Scanner;
import java.util.ArrayList;

class YaksuTest {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n;
		ArrayList list = new ArrayList();

		System.out.print("������ ���ڸ� �Է��ϼ��� : ");
		n = scan.nextInt();

		for(int i=1;i<=n;i++){
			if(n%i==0) {
				list.add(i);
			}
		}
		System.out.println(n + "�� �����"+ list);
	}
}
