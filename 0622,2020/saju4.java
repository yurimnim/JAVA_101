//import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class saju4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name;
        int year;
        int month;
        int date;
        int time;

        System.out.println("�̸��� �Է��ϼ���");
        name = scan.next();
        System.out.println("�¾ ����(����)�� �Է��ϼ���(��:1991)");
        year = scan.nextInt();
		  
		String userddi ="";
	
		String []ddi = {"�����̶�","�߶�","����","������","���","�Ҷ�","ȣ���̶�","�䳢��","���","���","����","���"};
		int []arr = {8,9,10,11,0,1,2,3,4,5,6,7};
        
		//40�п� �����մϴ�.

        String ganji = "�����ι�������̽�������";
        String ans1= "õ";
        String ans2= "�;ױ����ι�����������";
		int jisin12=0;
		userddi = ddi[year % 12];
		jisin12 = arr[year % 12];
     
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
		int z=0;
		switch (time) {
            case 23: case 24: z = 1; break;
            case 1: case 2: z = 2; break;
            case 3: case 4: z = 3; break;
            case 5: case 6: z = 4; break;
            case 7: case 8: z = 5; break;
            case 9: case 10: z = 6; break;
            case 11: case 12: z = 7; break;
            case 13: case 14: z = 8; break;
            case 15: case 16: z = 9; break;
            case 17: case 18: z = 10; break;
            case 19: case 20: z = 11; break;
            case 21: case 22: z = 12; break;
        }
		//�ٶ����� Ǯ�̰� �ǵ��� �ڵ带 ���� �� ���ϴ�.
		System.out.println(name + "���� ���� Ǯ���Դϴ�.");
		System.out.println(userddi+"�Դϴ�.");
		int temp =0;
		for (int i = 1; i <= 4; i++)
        {
            switch (i)
            {
                case 1:System.out.print("����:");temp = jisin12;break;
                case 2:System.out.print("����:");temp = temp + month - 1;break;
                case 3:System.out.print("����:");temp = temp + date - 1;break;
                case 4:System.out.print("����:");temp = temp + z-1;break;
            }

			temp = temp % 12;
			//temp = temp -1;
			System.out.println(ans1 + ans2.charAt(temp));
            
        }
        System.out.println("***************************");
    }
		

   

}




