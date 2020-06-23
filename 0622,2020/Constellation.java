import java.util.Scanner;
class Constellation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name,cons="";
		int month,day;
		System.out.println("이름을 입력하세요 =>");
		name=sc.next();
	
		while(true) {	
		System.out.println("몇월달에 태어났나요 =>");
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
		System.out.println("몇일에 태어났나요 =>");
		day=sc.nextInt();
		 if (day > 0 && day <= lastDay ){
			 break;
		 }
		}
		
		switch(month){
			case 1:
				if(day<20)	cons="염소";
				else		cons="물병";
				break;
			case 2:
				if(day<19)	cons="물병";
				else		cons="물고기";
				break;
			case 3:
				if(day<21)	cons="물고기";
				else		cons="양";
				break;
			case 4:
				if(day<20)	cons="양";
				else		cons="황소";
				break;
			case 5:
				if(day<21)	cons="황소";
				else		cons="쌍둥이";
				break;
			case 6:
				if(day<22)	cons="쌍둥이";
				else		cons="게";
				break;
			case 7:
				if(day<23)	cons="게";
				else		cons="사자";
				break;
			case 8:
				if(day<23)	cons="사자";
				else		cons="처녀";
				break;
			case 9:
				if(day<24)	cons="처녀";
				else		cons="천칭";
				break;
			case 10:
				if(day<23)	cons="천칭";
				else		cons="전갈";
				break;
			case 11:
				if(day<23)	cons="전갈";
				else		cons="사수";
				break;
			case 12:
				if(day<25)	cons="사수";
				else		cons="염소";
				break;
		}
		System.out.println(name+"님의 별자리는 "+cons+"자리 입니다.");

	}
}
