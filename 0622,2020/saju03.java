//import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class saju03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name;
        int year, month, date, time;  

        System.out.println("�̸��� �Է��ϼ���");
        name = scan.next();
        System.out.println("�¾ ����(����)�� �Է��ϼ���(��:1991)");
        year = scan.nextInt();
		  
		String userddi ="";

        String ddi1 = "���";
        String ddi2 = "�Ҷ�";
        String ddi3 = "ȣ���̶�";
        String ddi4 = "�䳢��";
        String ddi5 = "���";
        String ddi6 = "���";
        String ddi7 = "����";
        String ddi8 = "���";
        String ddi9 = "�����̶�";
        String ddi10 = "�߶�";
        String ddi11 = "����";
        String ddi12 = "������";

        String ganji = "�����ι�������̽�������";
        String ans1= "õ";
        String ans2= "�;ױ����ι�����������";


		// ó���� ���� int ���� �ϳ� ������ֱ� 
			
        for(int i=1948; i<=year ; i++) {
            if (year % 12 == 4){
                userddi = ddi1;
				// jisin12 = 1 ~ 12 ���� �־��ֱ� 
                char userganji = userddi.charAt(0);
                break;
            } else if (year % 12 == 5) {
                userddi = ddi2;
                break;
            } else if (year % 12 == 6) {
                System.out.println(ddi3);
                userddi = ddi3;
                break;
            } else if (year % 12 == 7) {
                System.out.println(ddi4);
                userddi = ddi4;
                break;
            } else if (year % 12 == 8) {
                System.out.println(ddi5);
                userddi = ddi5;
                break;
            } else if (year % 12 == 9) {
                System.out.println(ddi6);
                userddi = ddi6;
                break;
            } else if (year % 12 == 10) {
                System.out.println(ddi7);
                userddi = ddi7;
                break;
            } else if (year % 12 == 11) {
                System.out.println(ddi8);
                userddi = ddi8;
                break;
            } else if (year % 12 == 0) {
                userddi = ddi9;
                break;
            } else if (year % 12 == 1) {
                userddi = ddi10;
                break;
            } else if (year % 12 == 2) {
                userddi = ddi11;
                break;
            } else {
                userddi = ddi12;
                break;
            }
        }

	//�����ڵ� �����ؼ� ���̱� 
        System.out.println("�¾ ��(����)�� �Է��ϼ���");
        month = scan.nextInt();
        if(month<1 || month>12){
            System.out.println("�� �������� �ٽ� Ȯ���ϼ���");
            return;
        }
        System.out.println("�¾ ��(����)�� �Է��ϼ���(����)");
        date = scan.nextInt();
        int lastdate=31;
        switch(month){
            case 2: lastdate = 28;
            break;
            case 4: case 6: case 9: case 11: lastdate=30;
            break;
        }
        if(date<1 || date>lastdate){
            System.out.println("�� �ϻ����� �ٽ� Ȯ���ϼ���");
                return;
        }

        System.out.println("�¾ �ø� 1~24 ������ ������ �Է��ϼ���");
        time = scan.nextInt();
        if(time<1 || time>24){
            System.out.println("�ð��� �ٽ� Ȯ���ϼ���");
            return;
        }
		

    }

}




