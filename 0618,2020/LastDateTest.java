/*
	��������� ��������� �Է¹޾� ������ ���� ���Ͽ� ����ϴ� ���α׷� �ۼ�
	�� ���⿡ ���� ó�� ���� (��� ó��) 
*/

import java.util.Scanner;

class LastDateTest {
	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		int month; 
		String lastDay = "31��";

		System.out.println("���� �Է��ϼ���.");
		month = sc.nextInt();

		if (month < 1 || month > 12 ) {
			System.out.println("�߸��� �� �Դϴ�.");
			return;
		}

		switch (month) {
			case 2: lastDay = "28��"; break;
			case 4: case 6: case 9: case 11: lastDay = "30��"; 
		}
		//Switch �ȿ� boolean �� �� �� ���� int/String ���� ���� 


		System.out.println(month + " ���� ������ ���� " + lastDay + " �Դϴ�.");
  }
}	
