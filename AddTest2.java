import java.util.Scanner;

class AddTest2{
   public static void main(String[] args) {
      int a;
      int b;
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("ù��° ���� �Է��ϼ���.");
      a = sc.nextInt(); //a�� �޾Ƽ� �̰��� �����ϰڽ��ϴ�.

      System.out.println("�ι�° ���� �Է��ϼ���.");
      b = sc.nextInt(); //b�� �޾Ƽ� �̰��� �����ϰڽ��ϴ�.

      System.out.println("�� ������ �� ���� " + (a + b) + " �Դϴ�.");
      // a+b �� ��ȣ �����ָ� ab �� �� 	

  }
}