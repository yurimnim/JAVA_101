// �Ǻ���ġ ����
import java.util.Scanner;

class  Lab04Test {
	public static void main(String[] args) {
		int a = 0, b = 1, c;
		int input;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("++ �Ǻ���ġ ���� ��� ���α׷�++");
		do {
			System.out.println("���° �� ���� ����ұ��?");
			input = sc.nextInt();
			if(input > 0) {
				break;
			}
			System.out.println("����� �Է��ϼ���!");
		} while (true);
			
		System.out.print(a + "  ");
		
		if (input == 1) {
			return;
		}
		System.out.print (b + "  "); 
		if (input == 2) {
			return;
		}
		for (int i = 3; i <= input ; i++ ) {
				c = a + b;
				a = b; // a��  b�� ������
				b = c;
				System.out.print(c + "  ");		
			} 
		}
	}

