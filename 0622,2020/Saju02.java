import java.util.Scanner;

public class Saju02
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int jisin12,month, day, hour, i, temp;		// 생월

        System.out.println("사주풀이 프로그램입니다.");
        System.out.println("1) 쥐 띠");
        System.out.println("2) 소 띠");
        System.out.println("3) 범 띠");
        System.out.println("4) 토끼 띠");
        System.out.println("5) 용 띠");
        System.out.println("6) 뱀 띠");
        System.out.println("7) 말 띠");
        System.out.println("8) 양 띠");
        System.out.println("9) 원숭이 띠");
        System.out.println("10) 닭 띠");
        System.out.println("11) 개 띠");
        System.out.println("12) 돼지 띠");
        System.out.print("다음중 해당하는 띠의 번호를 입력하세요 : ");
        jisin12 = sc.nextInt();

        if(jisin12 < 1 || jisin12 > 12)
        {
            System.out.println("띠를 잘못 입력하였습니다. 프로그램을 종료합니다.");
            return;
        }

        System.out.print("태어난 월을 음력으로 입력하세요 : ");
        month = sc.nextInt();

        if(month < 1 || month > 12)
        {
            System.out.println("월을 잘못 입력하였습니다. 프로그램을 종료합니다.");
            return;
        }

        System.out.print("태어난 일을 음력으로 입력하세요 : ");
        day = sc.nextInt();

        if(day < 1 || day > 30)
        {
            System.out.println("일을 잘못 입력하였습니다. 프로그램을 종료합니다.");
            return;
        }

        System.out.println("1) 자시 (23:00 ~ 01:00)");
        System.out.println("2) 축시 (01:00 ~ 03:00)");
        System.out.println("3) 인시 (03:00 ~ 05:00)");
        System.out.println("4) 묘시 (05:00 ~ 07:00)");
        System.out.println("5) 진시 (07:00 ~ 09:00)");
        System.out.println("6) 사시 (09:00 ~ 11:00)");
        System.out.println("7) 오시 (11:00 ~ 13:00)");
        System.out.println("8) 미시 (13:00 ~ 15:00)");
        System.out.println("9) 신시 (15:00 ~ 17:00)");
        System.out.println("10) 유시 (17:00 ~ 19:00)");
        System.out.println("11) 술시 (19:00 ~ 21:00)");
        System.out.println("12) 해시 (21:00 ~ 23:00)");
        System.out.print("다음중 해당하는 태어난 시의 번호를 입력하세요 : ");
        hour = sc.nextInt();

        if(hour < 1 || hour > 12)
        {
            System.out.println("시를 잘못 입력하였습니다. 프로그램을 종료합니다.");
            return;
        }

        System.out.println("**********사주풀이**********");

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
                    System.out.println("천귀 : 귀인대접을 받습니다.");
                    break;
                case 2:
                    System.out.println("천액 : 액땜을 많이합니다.");
                    break;
                case 3:
                    System.out.println("천권 : 권력, 리더쉽이 있습니다.");
                    break;
                case 4:
                    System.out.println("천파 : 파동이 있는 삶을 겪습니다.");
                    break;
                case 5:
                    System.out.println("천인 : 인간성이 좋습니다.");
                    break;
                case 6:
                    System.out.println("천문 : 머리가 좋습니다.");
                    break;
                case 7:
                    System.out.println("천복 : 복이 많습니다.");
                    break;
                case 8:
                    System.out.println("천고 : 외로움을 많이 탑니다.");
                    break;
                case 9:
                    System.out.println("천역 : 역마살이 있습니다.");
                    break;
                case 10:
                    System.out.println("천간 : 이성에게 인기가 많습니다.");
                    break;
                case 11:
                    System.out.println("천수 : 손재주가 많습니다.");
                    break;
                case 12:
                    System.out.println("천명 : 오래 삽니다.");
                    break;
            }
        }
        System.out.println("***************************");
    }
}