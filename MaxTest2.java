import java.util.Scanner;

class MaxTest2 {

  public static void main(String[] args) {
     int a, b, max; 
     Scanner sc = new Scanner(System.in);
   
     System.out.println("ù��° �� �Է�");
     a = sc.nextInt();

     System.out.println("�ι�° �� �Է�");
     b = sc.nextInt();
     
     //���ù� 
     if (a > b)  
      max = a;
      else 
      max = b;
     
     System.out.println("ū ���� " + max);   
 }
}