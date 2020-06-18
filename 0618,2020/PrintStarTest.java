
//입력값에 따라 별을 몇개 출력할까요? 3개 출력 
import java.util.Scanner;

class PrintStarTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int star;
		System.out.println("별을 몇개 출력할까요?");
		star = sc.nextInt();	

		for (int i = 1; i <= star; i++) {
		  
		  System.out.println("*");
	  }
	  System.out.println("작업종료");
  }	
}

//(i++ 나 i = i+1써주기)
