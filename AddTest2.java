import java.util.Scanner;

class AddTest2{
   public static void main(String[] args) {
      int a;
      int b;
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("첫번째 수를 입력하세요.");
      a = sc.nextInt(); //a를 받아서 이곳에 저장하겠습니다.

      System.out.println("두번째 수를 입력하세요.");
      b = sc.nextInt(); //b를 받아서 이곳에 저장하겠습니다.

      System.out.println("두 숫자의 총 합은 " + (a + b) + " 입니다.");
      // a+b 에 괄호 안쳐주면 ab 로 뜸 	

  }
}