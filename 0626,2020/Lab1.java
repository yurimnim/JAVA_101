import java.util.Scanner;
class Lab1 {
			public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int arr[] = new int[10];
			int n;

				for (int i = 0 ;i <arr.length ;i++ ){
				
					System.out.println(( i+1) + "��° ������ �Է��ϼ���");
					n = sc.nextInt();
					arr[i] = n;
				}
	System.out.println( "�Է��� ����");
	for (int i:arr ){
		System.out.print(i + " ");				
	}
	System.out.println( "\n����");

	for (int i =9; i >=0 ;i-- ){
	System.out.print(arr[i] + " ");		//����
	 }

		
	}//main
}//class
