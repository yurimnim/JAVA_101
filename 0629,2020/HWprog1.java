import java.util.Scanner;
import java.util.ArrayList;
class HWprog1 
{
//1�⵿���� ��ü ���ݾ��� ��ȯ

	public static double getSum (double []arr){
		double sum = 0;
		for (int i=0;i<arr.length ;i++ )
		{	sum+=arr[i];
		}return sum;
	}

//���� ��� ��� �ݾ�

	public static double getAvg (double []arr){
		double sum=0, avg=0;
		for (int i=0;i<arr.length ;i++ )
		{	sum+=arr[i];
		} avg = sum/(arr.length);
		return avg;
	}

// ���� sum �޼ҵ� Ȱ���ϴ� �������	
	public static double getAvgS (double []arr){
		double sum = getSum(arr);
		double avg = sum/(arr.length);
		return avg;
	}

// ���� ������ ���Ҵ� ��

	public static ArrayList<Integer> getMax (double []arr){
		double max= arr[0]; //ū�� ã��
		for (int i=1; i<arr.length ;i++)
		{	if (arr[i]>max)
			{	max=arr[i];
			}
		}
		ArrayList<Integer>list = new ArrayList<Integer>();
		for (int i=0;i <arr.length ; i++ ) //list �� �ش�� ���
		{	if (arr[i] == max)
			{ list.add(i+1);
			}
		}
		return list;
	}

// ���� ������ ������ ��

	public static ArrayList<Integer> getMin (double[]arr){
		double min = arr[0];
		for (int i=1;i<arr.length ;i++ )
		{	if (arr[i]<min)
			{	min=arr[i];
			}
		}
		ArrayList<Integer>list = new ArrayList<Integer>();
		for (int i=0; i<arr.length ;i++ )
		{	if (arr[i] ==min)
			{ list.add(i+1);
			}
		}
		return list;
	}

	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);

		double []credit = new double[12];

		for (int i =0; i < credit.length ;)
		{
			System.out.print((i+1)+"���� ���ݾ�: ");
			credit[i] = sc.nextDouble();
			if (credit[i]<0)
			{
				System.out.print("���ݾ��� ������ �� �� �����ϴ�.");
				continue;
			}
			i++;
		}

		double sum = getSum(credit);	
		
		double avg = getAvg(credit);
		double avg2= getAvgS(credit);

		ArrayList<Integer> max = getMax(credit);
		ArrayList<Integer> min = getMin(credit);

		System.out.println("�հ� sum: "+sum);
		System.out.println("��� avg: "+avg);
		System.out.println("��� avgS: "+avg2);
		System.out.println("�ְ������ max: "+max);
		System.out.println("��������� min: "+min);

	}
}
