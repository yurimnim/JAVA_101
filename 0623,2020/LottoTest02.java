import java.util.Scanner;

class LottoTest02 {
	public static final int rank1 = 2;
	public static final int rank2 = 5;
	public static final int rank3 = 7;
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
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
				case rank1: System.out.println("***********1��! ��ڴ��!! ���ϵ帳�ϴ�!*********"); break;
				case rank2: System.out.println("***********2��! ���ϵ帳�ϴ�!*********"); break;
				case rank3: System.out.println("***********3��! ���ϵ帳�ϴ�!*********"); break;
				default : System.out.println(result); 
		}
 }
}