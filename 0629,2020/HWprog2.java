import java.util.Scanner;
class HWprog2
{   // 정답횟수
	public static int correctAnswers (char []user, String []answer){
		char ch;
		int cnt=0;
		for (int i=0; i<user.length;i++ )
		{	ch = answer[i].charAt(1);
			if (user[i] == ch)
			{cnt++;
			}
		}return cnt;
	}
	// 오답횟수
	public static int incorrectAnswers (char []user, String []answer){
		char ch;
		int cnt=0;
		for (int i=0; i<user.length;i++ )
		{	ch = answer[i].charAt(1);
			if (user[i] != ch)
			{cnt++;
			}
		}return cnt;
	}

	// 패스여부
	public static boolean isPassed (char []user, String []answer){
		boolean pass = (correctAnswers(user,answer)>=7)?true:false;
		return pass;
	}

	public static void main(String[] args) 
	{ Scanner sc = new Scanner(System.in);

	//문제배열
	String []question = {"캐나다의 수도는?\n(a)밴쿠버\t(b)토론토\t(c)오타와\t(d)재스퍼","??","??","??","??","??","??","??","??","??"};
	//정답배열
	String []answer = {"(c) 오타와","(b)","(c)","(a)","(d)","(b)","(c)","(d)","(a)","(b)"};
	//학생정답배열
	char []user = new char[10];

	//질문루프
	String n;
	for (int i =0; i<question.length ;i++ )
	{ 
		do
		{
		System.out.println((i+1)+" 번 문제: "+question[i]);
		n = sc.next();
		n = n.toLowerCase();
		user[i]=n.charAt(0);

			if ((user[i]>='a' && user[i]<='d')&&(n.length()==1))
			{System.out.println("답: "
				+answer[i]+"\n");
				break;
			}
		System.out.println("정답은 a,b,c,d 중 하나를 입력하세요");
		} while(true);
	}
	System.out.println("******* 시험 결과 *******");
	System.out.println("합격 여부: "+isPassed(user,answer));
	System.out.println("정답 횟수: "+correctAnswers(user,answer));	
	System.out.println("오답 횟수: "+incorrectAnswers(user,answer));
	}
}
