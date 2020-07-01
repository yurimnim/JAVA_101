
import java.util.Scanner;
class HWprog3
{//합계
	public static int getTotal(int []n){
		int sum=0;
		for (int i=0;i<n.length ;i++ )
		{	sum+=n[i];
		}return sum;
	}
 //평균
 	public static double getAverage(int []n){
		int sum=getTotal(n);
		double avg=sum/(double)(n.length);
		return avg;
	}
 //최대값
	public static int getMaximum(int []n){
		int max = n[0];
		for (int i=1; i<n.length ;i++ )
		{	if (n[i]>max)
			{ max=n[i];
			}
		}return max;
	}
 //최소값
	public static int getMinimum(int []n){
		int min = n[0];
		for (int i=1; i<n.length ;i++ )
		{	if (n[i]<min)
			{min=n[i];
			}
		}return min;
	}


	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		int n[] = new int[3];
	
		for (int i=0;i<n.length ;i++)
		{	System.out.println("정수를 입력하세요: ");
			n[i]=sc.nextInt();
		}


		System.out.println("**** 결 과 ****");
		System.out.println("합 계: "+getTotal(n));
		System.out.println("평 균: "+getAverage(n));
		System.out.println("최대값: "+getMaximum(n));
		System.out.println("최소값: "+getMinimum(n));

	}
}
