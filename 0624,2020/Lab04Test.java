// 피보나치 수열
import java.util.Scanner;

class  Lab04Test {
	public static void main(String[] args) {
		int a = 0, b = 1, c;
		int input;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("++ 피보나치 수열 출력 프로그램++");
		do {
			System.out.println("몇번째 항 까지 출력할까요?");
			input = sc.nextInt();
			if(input > 0) {
				break;
			}
			System.out.println("양수를 입력하세요!");
		} while (true);
			
		System.out.print(a + "  ");
		
		if (input == 1) {
			return;
		}
		System.out.print (b + "  "); 
		if (input == 2) {
			return;
		}
		for (int i = 3; i <= input ; i++ ) {
				c = a + b;
				a = b; // a를  b에 저자이
				b = c;
				System.out.print(c + "  ");		
			} 
		}
	}

