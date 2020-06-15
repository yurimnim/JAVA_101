import java.util.Scanner;

class FreeTest { 
   public static void main(String[] args) {
      String name;
      int age;

      Scanner sc  = new Scanner(System.in);

      System.out.println("이름을 입력하십시오.");
      name = sc.next();

      System.out.println("나이를 입력하십시오.");
      age =  sc.nextInt();  

     if (age >= 40) 
        System.out.println(name + " 님은 무료 암검진 대상자 입니다.");
     else
       System.out.println(name + " 님은 무료 암검진 대상자가 아닙니다.");   
  }
}