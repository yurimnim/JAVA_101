import java.util.Scanner;
import java.util.ArrayList;
class  HWprog4
{
	//�б⺰ �μ��� ��������
	public static void printSales (String []depart, double[][]arr){
		System.out.println("**** �μ�/�б⺰ ����� ****");
		for (int i =0;i <arr.length ;i++ )
		{	System.out.println(depart[i]+" ��");
			for (int j=0; j< arr[i].length ;j++ )
			{ System.out.println((j+1)+ "/4 �б� ����� : "+arr[i][j]);
			}System.out.println();
		}
	}

	// �б⺰ ȸ���� ��ü ����� ���
	public static void printTotalSales (double[][]arr){
		double sum=0;
		System.out.println("**** �б⺰ ��ü ����� ****");
		for (int i=0; i <arr[i].length ;i++ )
		{	for (int j =0 ; j < arr.length ;j++ )
			{	sum+=arr[j][i];
			}
			System.out.println((i+1)+"/4 �б� ��ü �����: "+sum);
			sum=0;
		}
		System.out.println();
	}

	// �б⺰ ȸ���� ��� ����� ���
	public static void printAvg(double[][]arr){
		System.out.println("**** �б⺰ ��� ����� ****");
		double sum=0, avg=0;
		int j=0;
		for (int i=0; i <arr[i].length ;i++ )
		{	for (j =0 ; j < arr.length ;j++ )
			{	sum+=arr[j][i];
			}
			avg = sum/j;
			System.out.println((i+1)+"/4 �б� ��� �����: "+avg);
			sum=0;
		}
		System.out.println();
	}

	// Ư�� �б⿡ �ְ��� ������ �ø� �μ��� ���
	public static void printBestD(String []depart, double[][]sales){
		//�ִ밪ã�� -> ���ϰ�ã��, idxã��
		double max=sales [0][0];
		
		for (int i=0; i <sales[i].length ;i++ )
		{	for (int j=1; j<sales.length ;j++ )
			{
				if (sales[j][i]>max)
				{	max=sales[j][i];
				}
			}
		}
		//���ϰ�ã��, idxã�� ���
		ArrayList list = new ArrayList();
		for (int i=0; i<sales[i].length ;i++ )
		{	System.out.println("****"+(i+1)+"/4 �б� �ְ���� �μ� ****");
			for (int j=0;j<sales.length ;j++ )
			{
				if (sales[j][i]==max)
				{	list.add(depart[j]);
				}
			}System.out.println(list+"\n");
			 for (int k = 0; k<list.size();k++ )//����Ʈ ����
			 {	list.remove(k);
			 }
		}
		
	}

	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);	
		String []depart = {"����1","����2","����3","����1","����2"};
		double [][]sales = new double[5][4];
		
		for (int i = 0; i<sales.length ;i++ )
		{ System.out.println("�μ� �� : "+depart[i]+" ��");
			for (int j=0; j<sales[i].length ;j++ )
			{
				do
				{	System.out.print((j+1)+ "/4 �б� ������� �Է��ϼ���: ");
					sales[i][j]=sc.nextDouble();
					if (sales[i][j]>=0)
					{break;
					}System.out.println("������ �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				}
				while (true);

			}System.out.println();
		}
	
	printSales(depart,sales);
	printTotalSales(sales);
	printAvg(sales);
	printBestD(depart,sales);


	}
}
