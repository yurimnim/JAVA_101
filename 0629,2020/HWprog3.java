
import java.util.Scanner;
class HWprog3
{//�հ�
	public static int getTotal(int []n){
		int sum=0;
		for (int i=0;i<n.length ;i++ )
		{	sum+=n[i];
		}return sum;
	}
 //���
 	public static double getAverage(int []n){
		int sum=getTotal(n);
		double avg=sum/(double)(n.length);
		return avg;
	}
 //�ִ밪
	public static int getMaximum(int []n){
		int max = n[0];
		for (int i=1; i<n.length ;i++ )
		{	if (n[i]>max)
			{ max=n[i];
			}
		}return max;
	}
 //�ּҰ�
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
		{	System.out.println("������ �Է��ϼ���: ");
			n[i]=sc.nextInt();
		}


		System.out.println("**** �� �� ****");
		System.out.println("�� ��: "+getTotal(n));
		System.out.println("�� ��: "+getAverage(n));
		System.out.println("�ִ밪: "+getMaximum(n));
		System.out.println("�ּҰ�: "+getMinimum(n));

	}
}
