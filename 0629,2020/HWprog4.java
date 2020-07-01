import java.util.Scanner;
import java.util.ArrayList;
class  HWprog4
{
	//분기별 부서별 매출액출력
	public static void printSales (String []depart, double[][]arr){
		System.out.println("**** 부서/분기별 매출액 ****");
		for (int i =0;i <arr.length ;i++ )
		{	System.out.println(depart[i]+" 부");
			for (int j=0; j< arr[i].length ;j++ )
			{ System.out.println((j+1)+ "/4 분기 매출액 : "+arr[i][j]);
			}System.out.println();
		}
	}

	// 분기별 회사의 전체 매출액 출력
	public static void printTotalSales (double[][]arr){
		double sum=0;
		System.out.println("**** 분기별 전체 매출액 ****");
		for (int i=0; i <arr[i].length ;i++ )
		{	for (int j =0 ; j < arr.length ;j++ )
			{	sum+=arr[j][i];
			}
			System.out.println((i+1)+"/4 분기 전체 매출액: "+sum);
			sum=0;
		}
		System.out.println();
	}

	// 분기별 회사의 평균 매출액 출력
	public static void printAvg(double[][]arr){
		System.out.println("**** 분기별 평균 매출액 ****");
		double sum=0, avg=0;
		int j=0;
		for (int i=0; i <arr[i].length ;i++ )
		{	for (j =0 ; j < arr.length ;j++ )
			{	sum+=arr[j][i];
			}
			avg = sum/j;
			System.out.println((i+1)+"/4 분기 평균 매출액: "+avg);
			sum=0;
		}
		System.out.println();
	}

	// 특정 분기에 최고의 매출을 올린 부서를 출력
	public static void printBestD(String []depart, double[][]sales){
		//최대값찾기 -> 동일값찾기, idx찾기
		double max=sales [0][0];
		
		for (int i=0; i <sales[i].length ;i++ )
		{	for (int j=1; j<sales.length ;j++ )
			{
				if (sales[j][i]>max)
				{	max=sales[j][i];
				}
			}
		}
		//동일값찾기, idx찾아 출력
		ArrayList list = new ArrayList();
		for (int i=0; i<sales[i].length ;i++ )
		{	System.out.println("****"+(i+1)+"/4 분기 최고매출 부서 ****");
			for (int j=0;j<sales.length ;j++ )
			{
				if (sales[j][i]==max)
				{	list.add(depart[j]);
				}
			}System.out.println(list+"\n");
			 for (int k = 0; k<list.size();k++ )//리스트 비우기
			 {	list.remove(k);
			 }
		}
		
	}

	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);	
		String []depart = {"유통1","유통2","유통3","국제1","국제2"};
		double [][]sales = new double[5][4];
		
		for (int i = 0; i<sales.length ;i++ )
		{ System.out.println("부서 명 : "+depart[i]+" 부");
			for (int j=0; j<sales[i].length ;j++ )
			{
				do
				{	System.out.print((j+1)+ "/4 분기 매출액을 입력하세요: ");
					sales[i][j]=sc.nextDouble();
					if (sales[i][j]>=0)
					{break;
					}System.out.println("음수를 입력하셨습니다. 다시 입력해주세요.");
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
