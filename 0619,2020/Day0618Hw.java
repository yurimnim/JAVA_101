/*
<<0618 ����>>

��������� �̸�,����,������ �Է¹޾�
���ڸ��� �Ǻ��Ͽ� ����ϴ� ���α׷��� �ۼ��մϴ�.

ex)
�̸��� �Է��ϼ���==>����ȣ
����޿� �¾���� ==> 1��
���Ͽ� �¾���� ==>25��
����ȣ���� ���ڸ��� �����ڸ��Դϴ�.

�����ڸ�
1/20 ~ 2/18
������ڸ�
2/19 ~ 3/20
���ڸ�
3/21 ~ 4/19
Ȳ���ڸ�
4/20 ~ 5/20
�ֵ����ڸ�
5/21 ~ 6/21
���ڸ�
6/22 ~ 7/22
�����ڸ�
7/23 ~ 8/22
ó���ڸ�
8/23 ~ 9/23
õĪ�ڸ�
9/24 ~ 10/22
�����ڸ� 
10/23 ~ 11/22
����ڸ�
11/23 ~ 12/24
�����ڸ�
12/25 ~ 1/19
*/

import java.util.Scanner;

class Day0618Hw {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name,con="";
		int mon,day;

		System.out.println("�̸��� �Է��ϼ���");
		name =sc.next();
		
		System.out.println("�¾ ���� �Է��ϼ���");
		mon =sc.nextInt();

		if (mon > 12 || mon < 0) {
			System.out.println("�߸��� �Է��Դϴ�.");
			return;
		}

		System.out.println("�¾ ���� �Է��ϼ���");
		day =sc.nextInt();
		
		int lastDay = 31; 

		switch (mon) {
		case 4: case 6: case 9: case 11: lastDay = 30; break;
		case 2: lastDay = 28; 
		}

		 if (lastDay < 0 || day > lastDay) {
			 	System.out.println("�߸��� �Է��Դϴ�.");
				return;		
		 }	
		 
	 switch(mon)
		{ case 1: if(day>=20) con="����";
	             else con="����";break;
		  case 2: if(day>=19) con="�����";
	             else con="����";break;
		  case 3: if(day>=21) con="��";
	             else con="�����";break;
	      case 4: if(day>=20) con="Ȳ��";
	             else con="��";break;
		  case 5: if(day>=21) con="�ֵ���";
	             else con="Ȳ��";break;
		  case 6: if(day>=22) con="��";
	             else con="�ֵ���";break;
		  case 7: if(day>=23) con="����";
	             else con="��";break;
		  case 8: if(day>=23) con="ó��";
	             else con="����";break;
		  case 9: if(day>=24) con="õĪ";
	             else con="ó��";break;
		  case 10: if(day>=23) con="����";
	             else con="õĪ";break;
		  case 11: if(day>=23) con="���";
	             else con="����";break;
          case 12: if(day>=25) con="����";
	             else con="���";break;
		}
	 
	   System.out.println(name+" ���� ���ڸ��� "+con+" �ڸ��Դϴ�");
	  
	} 
	 
}
