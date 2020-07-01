import java.util.Scanner;
import java.util.ArrayList;
class HWprog1 
{
//1년동안의 전체 사용금액을 반환

	public static double getSum (double []arr){
		double sum = 0;
		for (int i=0;i<arr.length ;i++ )
		{	sum+=arr[i];
		}return sum;
	}

//월별 평균 사용 금액

	public static double getAvg (double []arr){
		double sum=0, avg=0;
		for (int i=0;i<arr.length ;i++ )
		{	sum+=arr[i];
		} avg = sum/(arr.length);
		return avg;
	}

// 위의 sum 메소드 활용하는 월별평균	
	public static double getAvgS (double []arr){
		double sum = getSum(arr);
		double avg = sum/(arr.length);
		return avg;
	}

// 가장 지출이 많았던 월

	public static ArrayList<Integer> getMax (double []arr){
		double max= arr[0]; //큰값 찾기
		for (int i=1; i<arr.length ;i++)
		{	if (arr[i]>max)
			{	max=arr[i];
			}
		}
		ArrayList<Integer>list = new ArrayList<Integer>();
		for (int i=0;i <arr.length ; i++ ) //list 에 해당월 담기
		{	if (arr[i] == max)
			{ list.add(i+1);
			}
		}
		return list;
	}

// 가장 지출이 적었던 월

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
			System.out.print((i+1)+"월의 사용금액: ");
			credit[i] = sc.nextDouble();
			if (credit[i]<0)
			{
				System.out.print("사용금액은 음수가 될 수 없습니다.");
				continue;
			}
			i++;
		}

		double sum = getSum(credit);	
		
		double avg = getAvg(credit);
		double avg2= getAvgS(credit);

		ArrayList<Integer> max = getMax(credit);
		ArrayList<Integer> min = getMin(credit);

		System.out.println("합계 sum: "+sum);
		System.out.println("평균 avg: "+avg);
		System.out.println("평균 avgS: "+avg2);
		System.out.println("최고지출월 max: "+max);
		System.out.println("최저지출월 min: "+min);

	}
}
