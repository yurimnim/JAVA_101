import java.util.Scanner;

class SaJu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String outputYr = "";
        String outputMon = "";
        String outputDay = "";
        String outputHr = "";
        String ddi;
        int month, day, time, z = 0;
        int a = 0;

        System.out.println("���� ������ �Ʒ��� ���� �Է��ϼ���.");
        System.out.println(" ��, ��, ȣ����, �䳢, ��, ��, ��, ��, ������, ��, ��, ����");
        god = scan.next();

        switch (ddi) {
            case "��":outputYr = "õ��"; a = 1; break;
            case "��": outputYr = "õ��"; a = 2; break;
            case "ȣ����": outputYr = "õ��"; a = 3; break;
            case "�䳢": outputYr = "õ��"; a = 4; break;
            case "��": outputYr = "õ��"; a = 5; break;
            case "��": outputYr = "õ��"; a = 6; break;
            case "��": outputYr = "õ��"; a = 7; break;
            case "��": outputYr = "õ��"; a = 8; break;
            case "������": outputYr = "õ��"; a = 9; break;
            case "��": outputYr = "õ��"; a = 10; break;
            case "��": outputYr = "õ��"; a = 11; break;
            case "����": outputYr = "õ��"; a = 12; break;
            default: System.out.println("�߸��� �Է��Դϴ�. �ٽ� Ȯ�����ּ���"); return;
        }

        System.out.print("�� ���� �¾���� �Է��ϼ��� : ");
        month = scan.nextInt();
        if (month > 12 || month < 1) {
            System.out.println("�߸��� ������ �Է��ϼ̽��ϴ�. 1~12�� ���̸� �Է����ּ���.");
            return;
        }
        a = (a + month - 1) % 12;

        switch (a) {
            case 1: outputMon  = "õ��"; break;
            case 2: outputMon  = "õ��"; break;
            case 3: outputMon  = "õ��"; break;
            case 4: outputMon  = "õ��"; break;
            case 5: outputMon  = "õ��"; break;
            case 6: outputMon  = "õ��"; break;
            case 7: outputMon  = "õ��"; break;
            case 8: outputMon  = "õ��"; break;
            case 9: outputMon  = "õ��"; break;
            case 10: outputMon  = "õ��"; break;
            case 11: outputMon  = "õ��"; break;
            default: outputMon  = "õ��"; break;
        }

        System.out.print("�� �Ͽ� �¾���� �Է��ϼ��� : ");
        day = scan.nextInt();

        if (day > 31 || day < 1) {
            System.out.println("�߸��� ��¥�� �Է��ϼ̽��ϴ�. 1~31�ϱ��� �Է����ּ���");  
        } else if(month == 2) {
            if (day > 28)
                System.out.println("2���� 28�ϱ��� �ֽ��ϴ�. �ٽ� �������ּ���!");
				return;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if(day > 30) {
                System.out.println(month + "���� 30�ϱ��� �ֽ��ϴ�. �ٽ� �������ּ���!");
                return;
            }
        }

        a = (a + day -1) % 12;

        switch (a) {
            case 1: outputDay = "õ��"; break;
            case 2: outputDay = "õ��"; break;
            case 3: outputDay = "õ��"; break;
            case 4: outputDay = "õ��"; break;
            case 5: outputDay = "õ��"; break;
            case 6: outputDay = "õ��"; break;
            case 7: outputDay = "õ��"; break;
            case 8: outputDay = "õ��"; break;
            case 9: outputDay = "õ��"; break;
            case 10: outputDay = "õ��"; break;
            case 11: outputDay = "õ��"; break;
            default: outputDay = "õ��"; break;
        }

        System.out.println("�� �ÿ� �¾���� �Է��ϼ���. ");
        System.out.print("����) 1�� or 13�� or 23�� : ");
        time = scan.nextInt();

        if (time < 1 || time > 24)
            System.out.println("�߸��� �ð��� �Է��߽��ϴ�. 1��~24�� ���̸� �Է����ּ���."); return;

        switch (time) {
            case 23: case 24: z = 12; break;
            case 1: case 2: z = 1; break;
            case 3: case 4: z = 2; break;
            case 5: case 6: z = 3; break;
            case 7: case 8: z = 4; break;
            case 9: case 10: z = 5; break;
            case 11: case 12: z = 6; break;
            case 13: case 14: z = 7; break;
            case 15: case 16: z = 8; break;
            case 17: case 18: z = 9; break;
            case 19: case 20: z = 10; break;
            case 21: case 22: z = 11; break;
        }
        z = (a + z) % 12;
        switch (z) {
            case 1: outputHr = "õ��"; break;
            case 2: outputHr = "õ��"; break;
            case 3: outputHr = "õ��"; break;
            case 4: outputHr = "õ��"; break;
            case 5: outputHr = "õ��"; break;
            case 6: outputHr = "õ��"; break;
            case 7: outputHr = "õ��"; break;
            case 8: outputHr = "õ��"; break;
            case 9: outputHr = "õ��"; break;
            case 10: outputHr = "õ��"; break;
            case 11: outputHr = "õ��"; break;
            default: outputHr = "õ��"; break;
        }
        System.out.println("�� ����� ����");
        System.out.println("�� : " + outputYr);
        System.out.println("�� : " + outputMon);
        System.out.println("�� : " + outputDay);
        System.out.println("�� : " + outputHr);
    }
}