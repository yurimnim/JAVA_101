import java.util.Scanner;

class MaxTest{
  public static void main(String[] args) {
     int a, b, max; 
     Scanner sc = new Scanner(System.in);
   
     System.out.println("첫번째 수 입력");
     a = sc.nextInt();

     System.out.println("두번째 수 입력");
     b = sc.nextInt();
     
     //선택문 
     if (a > b)  
      System.out.println(a);
      else 
      System.out.println(b);
        
 }
}