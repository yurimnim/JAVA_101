import java.util.Scanner;

class LottoTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input;
		String result = "��! ������ȸ��!";
		
		do {
			System.out.println("***����*** 1~10 ���� ���� �� �ϳ��� �Է��Ͻÿ�.");
			input = sc.nextInt();
			if (input >= 1 && input <=9) {
				break;
			}
		}
		while (true);
		

		switch(input){
				case 2: System.out.println("***********1��! ��ڴ��!! ���ϵ帳�ϴ�!*********"); break;
				case 5: System.out.println("***********2��! ���ϵ帳�ϴ�!*********"); break;
				case 7: System.out.println("***********3��! ���ϵ帳�ϴ�!*********"); break;
				default : System.out.println(result); 
		}
 }
}