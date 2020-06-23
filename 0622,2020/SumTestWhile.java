import java.util.Scanner;

class SumTestWhile {
	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		while(i <=10) {
			sum = sum + i;
			i = i + 1;
		}
		System.out.println("sum:" + sum);
		System.out.println(i);
  }
}
		