// ����ڿ��� ������� �Է¹޾� ������ ��� 
//Switch �� �̿��ؼ� �ۼ� 
import java.util.Scanner;

class SeasonTestSwitch02 {
	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		int season; 
		String str = "";

		System.out.println("���� �Է��ϼ���.");
		season = sc.nextInt();

		switch (season)
		{
		case 3: case 4: case 5: str = "��"; break;
		case 6: case 7: case 8: str = "����"; break;
		case 9: case 10: case 11: str = "����"; break;
		case 12: case 1: case 2: str = "�ܿ�"; break;
		}
		System.out.println(season + "���� " + str + " �Դϴ�.");
  }
}	
