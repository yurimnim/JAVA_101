import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

class FortuneTeller02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Date today = new Date();
		int yr, mon, day, hr;


		//�Է�

		String outOfCriteria = "�߸��� �Է��Դϴ�.";
		
		//�⵵�Է�
		System.out.println("�¾ �⵵�� �Է��ϼ���");
		yr = sc.nextInt();

		int currentYear = today.getYear() + 1900;
		
		if (yr < 0 || yr > currentYear) {
			System.out.println(outOfCriteria);
			return;
		}
		
		//�� �Է�
		System.out.println("���� ������ �Է��ϼ���.");
		mon = sc.nextInt();

		if (mon < 0 || mon > 13) {
			System.out.println(outOfCriteria);
			return;
		}

		
		//�� �Է�
		System.out.println("���� ������ �Է��ϼ���.");
		day = sc.nextInt();

		// �� �� ������ �� �� �Ǻ�
		if (day < 0 || day > 31) {
			System.out.println(outOfCriteria);
			return;
		} else if (mon == 2) {
			 if (day > 28) {
				 System.out.println("2�� ������ ���� 28 Ȥ�� 29���Դϴ�. �ٽ� Ȯ���� �� �Է��ϼ���.");
				 return;
			 } 
		 } else if (mon == 4 || mon == 6 || mon == 9 || mon == 11) {
			 if (day > 29){
				  System.out.println("�Է��� ���� ���������� 30�� �Դϴ�. �ٽ� Ȯ���� �� �Է��ϼ���.");
				   return;
			 }		
		 }
		
		//�� �Է�
		System.out.println("�¾ �ø� �Է��ϼ���(�� - ���� 9�� 20��: 9 / ���� 10�� 40��: 20 / ���� 12�� 40��: 0)");
		hr = sc.nextInt();

		if (hr < 0 || hr > 24) {
			System.out.println(outOfCriteria);
			return;
		}

		//�ø� �ε��� ���� ȯ��
		switch(hr) {
			case 23: case 0: hr = 0; break;
			case 1: case 2: hr = 1; break;
			case 3: case 4: hr = 2; break;
			case 5: case 6: hr = 3; break;
			case 7: case 8: hr = 4; break;
			case 9: case 10: hr = 5; break;
			case 11: case 12: hr = 6; break;
			case 13: case 14: hr = 7; break;
			case 15: case 16: hr = 8; break;
			case 17: case 18: hr = 9; break;
			case 19: case 20: hr = 10; break;
			case 21: case 22: hr = 11; break;																																																											
		}


		//��� ����Ʈ

		String[] results = {"õ��: ������-�پ��� �о߿� ������ ����.", "õ��: �̼����� �αⰡ ����.", "õ��: ����� ���� ���� ����", "õ��: ����� ���", "õ��: ��𼭳� ���δ����� ���� ���", "õ��: �Ż翡 �׶��� ���� ����.", "õ��: �Ƿ¿�� �߸��� ���� ����", "õ��: �λ��� ǳ�İ� ����.", "õ��: ���� ������ Ÿ����.", "õ��: ����� �Ӹ��� Ÿ����.", "õ��: ���� ���� ���� ����.","õ��: �ܷο��� ��Ÿ�� ����"}; //index 11�� 

		//ù��° ������
		int outputYr = yr % 12;
		System.out.println(results[outputYr]);

		
		//�ι�° ������
		int monPlus = (outputYr + mon - 1) % 12;
		System.out.println(results[monPlus]);		

		//����° ��� ��� 
		int dayPlus = (monPlus + day - 1) % 12;
		System.out.println(results[dayPlus]);

		 
		//�׹�° ��� ���
		 int hrPlus = (dayPlus + hr) % 12;
		System.out.println(results[hrPlus]);
	}
}