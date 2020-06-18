import java.util.Scanner;
class  DigitToKoCopy
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n, nten, none;
		String ones="영일이삼사오육칠팔구";
		String ten="십";
		System.out.println("0~99 사이의 정수를 입력하세요");
		n=sc.nextInt();
		nten=n/10;
		none=n%10;
		if(n<0 || n>99)
		{
			System.out.println("잘못된 입력입니다.");
			return;
		}
		if(n<10)
			System.out.println(ones.charAt(n));
		else if(n==10)
			System.out.println(ten);
		else if(n%10==0)
			System.out.println(ones.charAt(nten)+ten);
		else if(n>10 && n<20)
			System.out.println(ten+ones.charAt(none));
		else if(n>20 && n<100)
			System.out.println(ones.charAt(nten)+ten+ones.charAt(none));
		
	}
}
