import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

class  HWprog4_2 {
	//�б⺰ �μ��� ��������
	public static void printSales (String []depart, double[][]arr){
		System.out.println("**** �μ�/�б⺰ ����� ****");
		for (int i =0;i <arr.length ;i++ ){	
			System.out.println(depart[i]+" ��");
			for (int j=0; j< arr[i].length ;j++ ) {
				System.out.println((j+1)+ "/4 �б� ����� : "+arr[i][j]);
			}
			 System.out.println();
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
		for (int i=0; i <arr[i].length ;i++ ) {	
			for (j =0 ; j < arr.length ;j++ ) {	
				sum+=arr[j][i];
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
		double []max_arr = new double[4];
		//[][][][]
		
		System.out.println("*** �б⺰ �ְ� ����� ***");
		for (int i=0; i <sales[0].length ;i++ )
		{	
			max_arr[i] = sales[0][i];
			for (int j=1; j<sales.length ;j++ )
			{
				if (sales[j][i]>max_arr[i])
				{	
					max_arr[i]=sales[j][i];
				}
			}

			System.out.println((i+1) + "�б� �ְ� �����:" + max_arr[i]);
		}

		//���ϰ�ã��, idxã�� ���
		//ArrayList list = new ArrayList();
		
		for (int i=0; i<sales[0].length ;i++ ) {	
			HashSet list =new HashSet();
			System.out.println("****"+(i+1)+"/4 �б� �ְ���� �μ� ****");
			for (int j=0;j<sales.length ;j++ ){
				if (sales[j][i]==max_arr[i]) {	
					list.add(depart[j]);
				}
			} System.out.println(list+"\n");
			 
			 /*
			 Hashset  ���� ����� �ʿ� ���� 
			 for (int k = 0; k<list.size();k++ ){
				 list.remove(k);
			 }
			 */
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
