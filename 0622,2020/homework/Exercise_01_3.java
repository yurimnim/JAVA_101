import java.util.Scanner;

// x가 1 부터 20 사이에 있으면 x값에 y를 저장한다. 

class Exercise_01_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int x, y;

		System.out.println("x 값 입력");
		x = sc.nextInt();

		System.out.println("y 값 입력");
		y = sc.nextInt();

		if (x > 0 && x < 20) {
			x = y;
		}
		
		System.out.println("x 값은 " + x + ", y 값은 " + y);	
  	}
 } 