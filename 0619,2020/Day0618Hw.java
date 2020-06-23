/*
<<0618 숙제>>

사용자한테 이름,생월,생일을 입력받아
별자리를 판별하여 출력하는 프로그램을 작성합니다.

ex)
이름을 입력하세요==>정재호
몇월달에 태어났나요 ==> 1월
몇일에 태어났나요 ==>25일
정재호님의 별자리는 물병자리입니다.

물병자리
1/20 ~ 2/18
물고기자리
2/19 ~ 3/20
양자리
3/21 ~ 4/19
황소자리
4/20 ~ 5/20
쌍둥이자리
5/21 ~ 6/21
게자리
6/22 ~ 7/22
사자자리
7/23 ~ 8/22
처녀자리
8/23 ~ 9/23
천칭자리
9/24 ~ 10/22
전갈자리 
10/23 ~ 11/22
사수자리
11/23 ~ 12/24
염소자리
12/25 ~ 1/19
*/

import java.util.Scanner;

class Day0618Hw {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name,con="";
		int mon,day;

		System.out.println("이름을 입력하세요");
		name =sc.next();
		
		System.out.println("태어난 달을 입력하세요");
		mon =sc.nextInt();

		if (mon > 12 || mon < 0) {
			System.out.println("잘못된 입력입니다.");
			return;
		}

		System.out.println("태어난 날을 입력하세요");
		day =sc.nextInt();
		
		int lastDay = 31; 

		switch (mon) {
		case 4: case 6: case 9: case 11: lastDay = 30; break;
		case 2: lastDay = 28; 
		}

		 if (lastDay < 0 || day > lastDay) {
			 	System.out.println("잘못된 입력입니다.");
				return;		
		 }	
		 
	 switch(mon)
		{ case 1: if(day>=20) con="물병";
	             else con="염소";break;
		  case 2: if(day>=19) con="물고기";
	             else con="물병";break;
		  case 3: if(day>=21) con="양";
	             else con="물고기";break;
	      case 4: if(day>=20) con="황소";
	             else con="양";break;
		  case 5: if(day>=21) con="쌍둥이";
	             else con="황소";break;
		  case 6: if(day>=22) con="게";
	             else con="쌍둥이";break;
		  case 7: if(day>=23) con="사자";
	             else con="게";break;
		  case 8: if(day>=23) con="처녀";
	             else con="사자";break;
		  case 9: if(day>=24) con="천칭";
	             else con="처녀";break;
		  case 10: if(day>=23) con="전갈";
	             else con="천칭";break;
		  case 11: if(day>=23) con="사수";
	             else con="전걸";break;
          case 12: if(day>=25) con="염소";
	             else con="사수";break;
		}
	 
	   System.out.println(name+" 님의 별자리는 "+con+" 자리입니다");
	  
	} 
	 
}
