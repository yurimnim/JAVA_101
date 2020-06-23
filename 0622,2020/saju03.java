//import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class saju03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name;
        int year, month, date, time;  

        System.out.println("이름을 입력하세요");
        name = scan.next();
        System.out.println("태어난 연도(음력)를 입력하세요(예:1991)");
        year = scan.nextInt();
		  
		String userddi ="";

        String ddi1 = "쥐띠";
        String ddi2 = "소띠";
        String ddi3 = "호랑이띠";
        String ddi4 = "토끼띠";
        String ddi5 = "용띠";
        String ddi6 = "뱀띠";
        String ddi7 = "말띠";
        String ddi8 = "양띠";
        String ddi9 = "원숭이띠";
        String ddi10 = "닭띠";
        String ddi11 = "개띠";
        String ddi12 = "돼지띠";

        String ganji = "자축인묘진사오미신유술해";
        String ans1= "천";
        String ans2= "귀액권파인문복고역간수명";


		// 처리를 위한 int 변수 하나 만들어주기 
			
        for(int i=1948; i<=year ; i++) {
            if (year % 12 == 4){
                userddi = ddi1;
				// jisin12 = 1 ~ 12 까지 넣어주기 
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

	//형님코드 응용해서 붙이기 
        System.out.println("태어난 월(음력)을 입력하세요");
        month = scan.nextInt();
        if(month<1 || month>12){
            System.out.println("몇 월생인지 다시 확인하세요");
            return;
        }
        System.out.println("태어난 일(음력)을 입력하세요(음력)");
        date = scan.nextInt();
        int lastdate=31;
        switch(month){
            case 2: lastdate = 28;
            break;
            case 4: case 6: case 9: case 11: lastdate=30;
            break;
        }
        if(date<1 || date>lastdate){
            System.out.println("몇 일생인지 다시 확인하세요");
                return;
        }

        System.out.println("태어난 시를 1~24 사이의 정수로 입력하세요");
        time = scan.nextInt();
        if(time<1 || time>24){
            System.out.println("시간을 다시 확인하세요");
            return;
        }
		

    }

}




