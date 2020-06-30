import java.util.Scanner;
class Lab1 {
			public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int arr[] = new int[10];
			int n;

				for (int i = 0 ;i <arr.length ;i++ ){
				
					System.out.println(( i+1) + "번째 정수를 입력하세요");
					n = sc.nextInt();
					arr[i] = n;
				}
	System.out.println( "입력한 정수");
	for (int i:arr ){
		System.out.print(i + " ");				
	}
	System.out.println( "\n역순");

	for (int i =9; i >=0 ;i-- ){
	System.out.print(arr[i] + " ");		//역순
	 }

		
	}//main
}//class
