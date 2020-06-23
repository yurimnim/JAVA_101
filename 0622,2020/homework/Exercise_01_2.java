import java.util.Scanner;

class Exercise_01_2 {
	
  public static void main(String[] args) {
  
      Scanner sc = new Scanner(System.in);

      int x,y,min,max;

      System.out.println("input x:");
      x = sc.nextInt();

      System.out.println("input y:");
      y = sc.nextInt();

      if (x > y) {
        max = x;
        min = y;
      } else if (x==y) {
        System.out.println("에러: 같은값 입력"); 
      } else {
        max = y;
        min = x;
      }

    System.out.println("min=" + min + " max=" + max);
 }
}