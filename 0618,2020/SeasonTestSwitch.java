// ����ڿ��� ������� �Է¹޾� ������ ��� 
//Switch �� �̿��ؼ� �ۼ� 
import java.util.Scanner;

class SeasonTestSwitch {
	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		int season; 
		
		System.out.println("���� �Է��ϼ���.");
		season = sc.nextInt();

		switch (season)
		{
		case 3: case 4: case 5: 
			System.out.println(season + "���� ��");break;
 
		case 6: case 7: case 8: 
			System.out.println(season + "���� ���� ");break;
		
		case 9: case 10: case 11: 
			System.out.println(season + "���� ���� ");break;

		case 12: case 1: case 2: 
			System.out.println(season + "���� �ܿ�  ");break;

		default:
			System.out.println("�߸��� �� �Է� ");break;	
		}
  }
}	
