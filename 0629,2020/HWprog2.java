import java.util.Scanner;
class HWprog2
{   // ����Ƚ��
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
	// ����Ƚ��
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

	// �н�����
	public static boolean isPassed (char []user, String []answer){
		boolean pass = (correctAnswers(user,answer)>=7)?true:false;
		return pass;
	}

	public static void main(String[] args) 
	{ Scanner sc = new Scanner(System.in);

	//�����迭
	String []question = {"ĳ������ ������?\n(a)�����\t(b)�����\t(c)��Ÿ��\t(d)�罺��","??","??","??","??","??","??","??","??","??"};
	//����迭
	String []answer = {"(c) ��Ÿ��","(b)","(c)","(a)","(d)","(b)","(c)","(d)","(a)","(b)"};
	//�л�����迭
	char []user = new char[10];

	//��������
	String n;
	for (int i =0; i<question.length ;i++ )
	{ 
		do
		{
		System.out.println((i+1)+" �� ����: "+question[i]);
		n = sc.next();
		n = n.toLowerCase();
		user[i]=n.charAt(0);

			if ((user[i]>='a' && user[i]<='d')&&(n.length()==1))
			{System.out.println("��: "
				+answer[i]+"\n");
				break;
			}
		System.out.println("������ a,b,c,d �� �ϳ��� �Է��ϼ���");
		} while(true);
	}
	System.out.println("******* ���� ��� *******");
	System.out.println("�հ� ����: "+isPassed(user,answer));
	System.out.println("���� Ƚ��: "+correctAnswers(user,answer));	
	System.out.println("���� Ƚ��: "+incorrectAnswers(user,answer));
	}
}
