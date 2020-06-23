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

        System.out.println("무슨 띠인지 아래를 보고 입력하세요.");
        System.out.println(" 쥐, 소, 호랑이, 토끼, 용, 뱀, 말, 양, 원숭이, 닭, 개, 돼지");
        god = scan.next();

        switch (ddi) {
            case "쥐":outputYr = "천귀"; a = 1; break;
            case "소": outputYr = "천액"; a = 2; break;
            case "호랑이": outputYr = "천권"; a = 3; break;
            case "토끼": outputYr = "천파"; a = 4; break;
            case "용": outputYr = "천인"; a = 5; break;
            case "뱀": outputYr = "천문"; a = 6; break;
            case "말": outputYr = "천복"; a = 7; break;
            case "양": outputYr = "천고"; a = 8; break;
            case "원숭이": outputYr = "천역"; a = 9; break;
            case "닭": outputYr = "천간"; a = 10; break;
            case "개": outputYr = "천수"; a = 11; break;
            case "돼지": outputYr = "천명"; a = 12; break;
            default: System.out.println("잘못된 입력입니다. 다시 확인해주세요"); return;
        }

        System.out.print("몇 월에 태어났는지 입력하세요 : ");
        month = scan.nextInt();
        if (month > 12 || month < 1) {
            System.out.println("잘못된 범위를 입력하셨습니다. 1~12월 사이를 입력해주세요.");
            return;
        }
        a = (a + month - 1) % 12;

        switch (a) {
            case 1: outputMon  = "천귀"; break;
            case 2: outputMon  = "천액"; break;
            case 3: outputMon  = "천권"; break;
            case 4: outputMon  = "천파"; break;
            case 5: outputMon  = "천인"; break;
            case 6: outputMon  = "천문"; break;
            case 7: outputMon  = "천복"; break;
            case 8: outputMon  = "천고"; break;
            case 9: outputMon  = "천역"; break;
            case 10: outputMon  = "천간"; break;
            case 11: outputMon  = "천수"; break;
            default: outputMon  = "천명"; break;
        }

        System.out.print("몇 일에 태어났는지 입력하세요 : ");
        day = scan.nextInt();

        if (day > 31 || day < 1) {
            System.out.println("잘못된 날짜를 입력하셨습니다. 1~31일까지 입력해주세요");  
        } else if(month == 2) {
            if (day > 28)
                System.out.println("2월은 28일까지 있습니다. 다시 기입해주세요!");
				return;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if(day > 30) {
                System.out.println(month + "월은 30일까지 있습니다. 다시 기입해주세요!");
                return;
            }
        }

        a = (a + day -1) % 12;

        switch (a) {
            case 1: outputDay = "천귀"; break;
            case 2: outputDay = "천액"; break;
            case 3: outputDay = "천권"; break;
            case 4: outputDay = "천파"; break;
            case 5: outputDay = "천인"; break;
            case 6: outputDay = "천문"; break;
            case 7: outputDay = "천복"; break;
            case 8: outputDay = "천고"; break;
            case 9: outputDay = "천역"; break;
            case 10: outputDay = "천간"; break;
            case 11: outputDay = "천수"; break;
            default: outputDay = "천명"; break;
        }

        System.out.println("몇 시에 태어났는지 입력하세요. ");
        System.out.print("예시) 1시 or 13시 or 23시 : ");
        time = scan.nextInt();

        if (time < 1 || time > 24)
            System.out.println("잘못된 시간을 입력했습니다. 1시~24시 사이를 입력해주세요."); return;

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
            case 1: outputHr = "천귀"; break;
            case 2: outputHr = "천액"; break;
            case 3: outputHr = "천권"; break;
            case 4: outputHr = "천파"; break;
            case 5: outputHr = "천인"; break;
            case 6: outputHr = "천문"; break;
            case 7: outputHr = "천복"; break;
            case 8: outputHr = "천고"; break;
            case 9: outputHr = "천역"; break;
            case 10: outputHr = "천간"; break;
            case 11: outputHr = "천수"; break;
            default: outputHr = "천명"; break;
        }
        System.out.println("↓ 당신의 사주");
        System.out.println("띠 : " + outputYr);
        System.out.println("월 : " + outputMon);
        System.out.println("일 : " + outputDay);
        System.out.println("시 : " + outputHr);
    }
}