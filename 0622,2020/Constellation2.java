/*
����ڿ��� �̸�, ����, ������ �Է¹޾�
���ڸ��� �Ǻ��ϴ� ����ϴ� ���α׷��� �ۼ��մϴ�.

<<���࿹>>
�̸��� �Է��ϼ��� :
����޿� �¾���� :
���Ͽ� �¾���� :
""���� ���ڸ��� ""�Դϴ�.
�߽¿� ������ while���� ����ؼ� ���ĺ���
*/
import java.util.Scanner;
class  Constellation2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name, star ="";
		int birth_month, birth_day;
		

		System.out.print("�̸��� �Է��ϼ���: ");
		name = sc.next();
		while(true)
		{
			System.out.print("����޿� �¾���� :");
			birth_month = sc.nextInt();
			if(birth_month >= 0 && birth_month <= 12){break;}
		}
		while(true)
		{
			System.out.print("���Ͽ� �¾���� :");
			birth_day = sc.nextInt();
			if(birth_month == 2 && birth_day <= 28)//�� birth_month �� birth_day�� �� if���� �ְ� ó���ϸ� 28�� �Ѱܵ� ���ڸ��� ���Ϳ�
				{break;}
			else if(birth_month == 4 || birth_month == 6 ||birth_month == 9 ||birth_month == 11)
			{ 
				if(birth_day <=30)
				{break;}
			}
			else if(birth_day <= 31)
			{break;}
		}
	    switch(birth_month){
			case 1: if(birth_day <= 19){star = "�����ڸ�";}else{star = "�����ڸ�";} break;
			case 2: if(birth_day <= 18){star = "�����ڸ�";} else{star = "������ڸ�";}break;
			case 3: if(birth_day <= 20){star = "������ڸ�";} else{star = "���ڸ�";}break;
			case 4: if(birth_day <= 19){star = "���ڸ�";} else{star = "Ȳ���ڸ�";}break;
			case 5: if(birth_day <= 20){star = "Ȳ���ڸ�";} else{star = "�ֵ����ڸ�";}break;
			case 6: if(birth_day <= 21){star = "�ֵ����ڸ�";} else{star = "���ڸ�";}break;
			case 7: if(birth_day <= 22){star = "���ڸ�";} else{star = "�����ڸ�";}break;
			case 8: if(birth_day <= 22){star = "�����ڸ�";} else{star = "ó���ڸ�";}break;
			case 9: if(birth_day <= 23){star = "ó���ڸ�";} else{star = "õĪ�ڸ�";}break;
			case 10: if(birth_day <= 22){star = "õĪ�ڸ�";} else{star = "�����ڸ�";}break;
			case 11: if(birth_day <= 22){star = "�����ڸ�";} else{star = "����ڸ�";}break;
			case 12: if(birth_day <= 24){star = "����ڸ�";} else{star = "�����ڸ�";}break;
		}
		System.out.println(name + "���� ���ڸ��� " + star + "�Դϴ�.");
	}
}
