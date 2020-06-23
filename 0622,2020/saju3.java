//import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;
import java.util.ArrayList;

public class saju3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name;
        int year;
        int month;
        int date;
        int time;

        System.out.println("이름을 입력하세요");
        name = scan.next();
        System.out.println("태어난 연도(음력)를 입력하세요(예:1991)");
        year = scan.nextInt();
		  
		String []ddi = { "원숭이띠", "닭띠", "개띠", "돼지띠", "쥐띠", "소띠", "호랑이띠", "토끼띠", "용띠", "뱀띠", "말띠", "양띠",};
		userddi =  ddi[year%12];

		int [] arr = {8,9,10,11,0,1,2,3,4,5,6,7};
	
		 	
		/*	
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

		*/
	
        String ganji = "자축인묘진사오미신유술해";
        String ans1= "천";
        String ans2= "귀액권파인문복고역간수명";
		int jisin12=0;
		userddi =  ddi[year%12];
		jisin12 = arr[year%12];

  /*   
            if (year % 12 == 4){
                userddi = ddi1;
                char userganji = userddi.charAt(0);
				jisin12 = 0;
                
            } else if (year % 12 == 5) {
                userddi = ddi2;
				jisin12 = 1;
              
            } else if (year % 12 == 6) {
                System.out.println(ddi3);
                userddi = ddi3;
				jisin12 = 2;
               
            } else if (year % 12 == 7) {
                System.out.println(ddi4);
                userddi = ddi4;
				jisin12 = 3;
               
            } else if (year % 12 == 8) {
                System.out.println(ddi5);
                userddi = ddi5;
				jisin12 = 4;
                
            } else if (year % 12 == 9) {
                System.out.println(ddi6);
                userddi = ddi6;
				jisin12 = 5;
               
            } else if (year % 12 == 10) {
                System.out.println(ddi7);
                userddi = ddi7;
				jisin12 = 6;
              
            } else if (year % 12 == 11) {
                System.out.println(ddi8);
                userddi = ddi8;
				jisin12 = 7;
                
            } else if (year % 12 == 0) {
                userddi = ddi9;
				jisin12 = 8;
               
            } else if (year % 12 == 1) {
                userddi = ddi10;
				jisin12 = 9;
                
            } else if (year % 12 == 2) {
                userddi = ddi11;
				jisin12 = 10;
               
            } else {
                userddi = ddi12;
				jisin12 = 11;
              
            }
      */
	
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
		//바람직한 풀이가 되도록 코드를 수정 해 봅니다.
		System.out.println(name + "님의 사주 풀이입니다.");
		System.out.println(userddi+"입니다.");
		int temp =0;
		for (int i = 1; i <= 4; i++)
        {
            switch (i)
            {
                case 1:System.out.print("생년:");temp = jisin12;break;
                case 2:System.out.print("생월:");temp = temp + month - 1;break;
                case 3:System.out.print("생일:");temp = temp + date - 1;break;
                case 4:System.out.print("생시:");temp = temp + z-1;break;
            }

			temp = temp % 12;
			//temp = temp -1;
			System.out.println(ans1 + ans2.charAt(temp));
            
        }
        System.out.println("***************************");
    }
		

   

}




