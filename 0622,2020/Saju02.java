import java.util.Scanner;

public class Saju02
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int jisin12,month, day, hour, i, temp;		// ����

        System.out.println("����Ǯ�� ���α׷��Դϴ�.");
        System.out.println("1) �� ��");
        System.out.println("2) �� ��");
        System.out.println("3) �� ��");
        System.out.println("4) �䳢 ��");
        System.out.println("5) �� ��");
        System.out.println("6) �� ��");
        System.out.println("7) �� ��");
        System.out.println("8) �� ��");
        System.out.println("9) ������ ��");
        System.out.println("10) �� ��");
        System.out.println("11) �� ��");
        System.out.println("12) ���� ��");
        System.out.print("������ �ش��ϴ� ���� ��ȣ�� �Է��ϼ��� : ");
        jisin12 = sc.nextInt();

        if(jisin12 < 1 || jisin12 > 12)
        {
            System.out.println("�츦 �߸� �Է��Ͽ����ϴ�. ���α׷��� �����մϴ�.");
            return;
        }

        System.out.print("�¾ ���� �������� �Է��ϼ��� : ");
        month = sc.nextInt();

        if(month < 1 || month > 12)
        {
            System.out.println("���� �߸� �Է��Ͽ����ϴ�. ���α׷��� �����մϴ�.");
            return;
        }

        System.out.print("�¾ ���� �������� �Է��ϼ��� : ");
        day = sc.nextInt();

        if(day < 1 || day > 30)
        {
            System.out.println("���� �߸� �Է��Ͽ����ϴ�. ���α׷��� �����մϴ�.");
            return;
        }

        System.out.println("1) �ڽ� (23:00 ~ 01:00)");
        System.out.println("2) ��� (01:00 ~ 03:00)");
        System.out.println("3) �ν� (03:00 ~ 05:00)");
        System.out.println("4) ���� (05:00 ~ 07:00)");
        System.out.println("5) ���� (07:00 ~ 09:00)");
        System.out.println("6) ��� (09:00 ~ 11:00)");
        System.out.println("7) ���� (11:00 ~ 13:00)");
        System.out.println("8) �̽� (13:00 ~ 15:00)");
        System.out.println("9) �Ž� (15:00 ~ 17:00)");
        System.out.println("10) ���� (17:00 ~ 19:00)");
        System.out.println("11) ���� (19:00 ~ 21:00)");
        System.out.println("12) �ؽ� (21:00 ~ 23:00)");
        System.out.print("������ �ش��ϴ� �¾ ���� ��ȣ�� �Է��ϼ��� : ");
        hour = sc.nextInt();

        if(hour < 1 || hour > 12)
        {
            System.out.println("�ø� �߸� �Է��Ͽ����ϴ�. ���α׷��� �����մϴ�.");
            return;
        }

        System.out.println("**********����Ǯ��**********");

        for (i = 1, temp = 0; i <= 4; i++) {
            switch (i) {
                case 1: temp = jisin12; break;
                case 2: temp = temp + month - 1; break;
                case 3: temp = temp + day - 1; break;
                case 4: temp = temp + hour - 1; break;
            }

			System.out.println(temp);

			if (temp > 12)
				temp -= 12;
			//

            switch (temp)
            {
                case 1:
                    System.out.println("õ�� : ���δ����� �޽��ϴ�.");
                    break;
                case 2:
                    System.out.println("õ�� : �׶��� �����մϴ�.");
                    break;
                case 3:
                    System.out.println("õ�� : �Ƿ�, �������� �ֽ��ϴ�.");
                    break;
                case 4:
                    System.out.println("õ�� : �ĵ��� �ִ� ���� �޽��ϴ�.");
                    break;
                case 5:
                    System.out.println("õ�� : �ΰ����� �����ϴ�.");
                    break;
                case 6:
                    System.out.println("õ�� : �Ӹ��� �����ϴ�.");
                    break;
                case 7:
                    System.out.println("õ�� : ���� �����ϴ�.");
                    break;
                case 8:
                    System.out.println("õ�� : �ܷο��� ���� ž�ϴ�.");
                    break;
                case 9:
                    System.out.println("õ�� : �������� �ֽ��ϴ�.");
                    break;
                case 10:
                    System.out.println("õ�� : �̼����� �αⰡ �����ϴ�.");
                    break;
                case 11:
                    System.out.println("õ�� : �����ְ� �����ϴ�.");
                    break;
                case 12:
                    System.out.println("õ�� : ���� ��ϴ�.");
                    break;
            }
        }
        System.out.println("***************************");
    }
}