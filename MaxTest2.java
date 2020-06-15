import java.util.Scanner;

class MaxTest2 {

  public static void main(String[] args) {
     int a, b, max; 
     Scanner sc = new Scanner(System.in);
   
     System.out.println("첫번째 수 입력");
     a = sc.nextInt();

     System.out.println("두번째 수 입력");
     b = sc.nextInt();
     
     //선택문 
     if (a > b)  
      max = a;
      else 
      max = b;
     
     System.out.println("큰 수는 " + max);   
 }
}