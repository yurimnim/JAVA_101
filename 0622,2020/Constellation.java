import java.util.Scanner;
class Constellation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name,cons="";
		int month,day;
		System.out.println("�̸��� �Է��ϼ��� =>");
		name=sc.next();
	
		while(true) {	
		System.out.println("����޿� �¾���� =>");
		month=sc.nextInt();
		
			if (month >= 1 && month <=12){
				break;
		 }
		}
		
		int lastDay = 31;
		if(month==4 || month==6 || month==9| month==11){
			lastDay = 30;
		} else if(month==2) {
			lastDay = 29;
		}
		
		while(true) {
		System.out.println("���Ͽ� �¾���� =>");
		day=sc.nextInt();
		 if (day > 0 && day <= lastDay ){
			 break;
		 }
		}
		
		switch(month){
			case 1:
				if(day<20)	cons="����";
				else		cons="����";
				break;
			case 2:
				if(day<19)	cons="����";
				else		cons="�����";
				break;
			case 3:
				if(day<21)	cons="�����";
				else		cons="��";
				break;
			case 4:
				if(day<20)	cons="��";
				else		cons="Ȳ��";
				break;
			case 5:
				if(day<21)	cons="Ȳ��";
				else		cons="�ֵ���";
				break;
			case 6:
				if(day<22)	cons="�ֵ���";
				else		cons="��";
				break;
			case 7:
				if(day<23)	cons="��";
				else		cons="����";
				break;
			case 8:
				if(day<23)	cons="����";
				else		cons="ó��";
				break;
			case 9:
				if(day<24)	cons="ó��";
				else		cons="õĪ";
				break;
			case 10:
				if(day<23)	cons="õĪ";
				else		cons="����";
				break;
			case 11:
				if(day<23)	cons="����";
				else		cons="���";
				break;
			case 12:
				if(day<25)	cons="���";
				else		cons="����";
				break;
		}
		System.out.println(name+"���� ���ڸ��� "+cons+"�ڸ� �Դϴ�.");

	}
}
