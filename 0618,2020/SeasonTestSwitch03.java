// ����ڿ��� ������� �Է¹޾� ������ ��� 
//Switch �� �̿��ؼ� �ۼ� 
import java.util.Scanner;

class SeasonTestSwitch03 {
	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		int season; 
		String str = "";

		System.out.println("���� �Է��ϼ���.");
		season = sc.nextInt();

		if (season < 1 || season > 12 ) {
			System.out.println("�߸��� �� �Դϴ�.");
			return;
		}

		switch (season)
		{
		case 3: case 4: case 5: str = "��"; break;
		case 6: case 7: case 8: str = "����"; break;
		case 9: case 10: case 11: str = "����"; break;
		default: str = "�ܿ�"; break;
		}
		System.out.println(season + "���� " + str + " �Դϴ�.");
  }
}	
