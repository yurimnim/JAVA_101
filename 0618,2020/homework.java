
// 사용자한테 0~99사이의 정수를 입력받아
// 한글 표기식 출력하는 프로그램을 작성하세요.

// << 실행 예 >>
// 0 ~ 99 사이의 수를 입력 ==> 27 이십칠



import java.util.Scanner;
class homework 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("숫자를 입력하시오: ");
		String num = scan.next(); //91
		String first = num.substring(0,1);//9

		if(num.length() == 2) {
		String second = num.substring(1,2);//1
		

        //91
		int fs = Integer.parseInt(first); //9
		//1

		//System.out.println(num2);
        
		
		
		if(num.length() == 2) {

			int num2 = Integer.parseInt(num);
			String second = num.substring(1,2);//1
			int sd = Integer.parseInt(second);
	
			if( fs == 0 ){
			System.out.print("영");
			}else if( fs == 1 ){
			System.out.print("일");
			}else if( fs == 2 ){
			System.out.print("이");
			}else if( fs == 3 ){
			System.out.print("삼");
			}else if( fs == 4 ){
			System.out.print("사");
			}else if( fs == 5 ){
			System.out.print("오");
			}else if( fs == 6 ){
			System.out.print("육");
			}else if( fs == 7 ){
			System.out.print("칠");
			}else if( fs == 8 ){
			System.out.print("팔");
			}else if( fs == 9 ){
			System.out.print("구");
			}

		    if( sd == 0 ){
			System.out.print("십");
			}else if( sd == 1 ){
			System.out.print("십일");
			}else if( sd == 2 ){
			System.out.print("십이");
			}else if( sd == 3 ){
			System.out.print("십삼");
			}else if( sd == 4 ){
			System.out.print("십사");
			}else if( sd == 5 ){
			System.out.print("십오");
			}else if( sd == 6 ){
			System.out.print("십육");
			}else if( sd == 7 ){
			System.out.print("십칠");
			}else if( sd == 8 ){
			System.out.print("십팔");
			}else if  {
			System.out.print("십구");
			}
			
				
		}else if(num2 <9){	
		
		 if( fs == 0 ){
			System.out.print("영");
		}else if( fs == 1 ){
			System.out.print("일");
		}else if( fs == 2 ){
			System.out.print("이");
		}else if( fs == 3 ){
			System.out.print("삼");
		}else if( fs == 4 ){
			System.out.print("사");
		}else if( fs == 5 ){
			System.out.print("오");
		}else if( fs == 6 ){
			System.out.print("육");
		}else if( fs == 7 ){
			System.out.print("칠");
		}else if( fs == 8 ){
			System.out.print("팔");
		}else if( fs == 9 ){
			System.out.print("구");

		}
}
		

//System.out.print(fs);
//System.out.print(sd);