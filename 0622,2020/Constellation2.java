/*
사용자에게 이름, 생월, 생일을 입력받아
별자리를 판별하는 출력하는 프로그램을 작성합니다.

<<실행예>>
이름을 입력하세요 :
몇월달에 태어났나요 :
몇일에 태어났나요 :
""님의 별자리는 ""입니다.
추승연 숙제를 while문을 사용해서 고쳐보기
*/
import java.util.Scanner;
class  Constellation2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name, star ="";
		int birth_month, birth_day;
		

		System.out.print("이름을 입력하세요: ");
		name = sc.next();
		while(true)
		{
			System.out.print("몇월달에 태어났나요 :");
			birth_month = sc.nextInt();
			if(birth_month >= 0 && birth_month <= 12){break;}
		}
		while(true)
		{
			System.out.print("몇일에 태어났나요 :");
			birth_day = sc.nextInt();
			if(birth_month == 2 && birth_day <= 28)//왜 birth_month 랑 birth_day를 한 if문에 넣고 처리하면 28을 넘겨도 별자리가 나와요
				{break;}
			else if(birth_month == 4 || birth_month == 6 ||birth_month == 9 ||birth_month == 11)
			{ 
				if(birth_day <=30)
				{break;}
			}
			else if(birth_day <= 31)
			{break;}
		}
	    switch(birth_month){
			case 1: if(birth_day <= 19){star = "염소자리";}else{star = "물병자리";} break;
			case 2: if(birth_day <= 18){star = "물병자리";} else{star = "물고기자리";}break;
			case 3: if(birth_day <= 20){star = "물고기자리";} else{star = "양자리";}break;
			case 4: if(birth_day <= 19){star = "양자리";} else{star = "황소자리";}break;
			case 5: if(birth_day <= 20){star = "황소자리";} else{star = "쌍둥이자리";}break;
			case 6: if(birth_day <= 21){star = "쌍둥이자리";} else{star = "게자리";}break;
			case 7: if(birth_day <= 22){star = "게자리";} else{star = "사자자리";}break;
			case 8: if(birth_day <= 22){star = "사자자리";} else{star = "처녀자리";}break;
			case 9: if(birth_day <= 23){star = "처녀자리";} else{star = "천칭자리";}break;
			case 10: if(birth_day <= 22){star = "천칭자리";} else{star = "전갈자리";}break;
			case 11: if(birth_day <= 22){star = "전갈자리";} else{star = "사수자리";}break;
			case 12: if(birth_day <= 24){star = "사수자리";} else{star = "염소자리";}break;
		}
		System.out.println(name + "님의 별자리는 " + star + "입니다.");
	}
}
