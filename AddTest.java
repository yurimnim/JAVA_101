import java.util.Scanner;

class AddTest{
   public static void main(String[] args) {
      int a;
      int b;
      int add;
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("ù��° ���� �Է��ϼ���.");
      a = sc.nextInt(); //a�� �޾Ƽ� �̰��� �����ϰڽ��ϴ�.

      System.out.println("�ι�° ���� �Է��ϼ���.");
      b = sc.nextInt(); //b�� �޾Ƽ� �̰��� �����ϰڽ��ϴ�.

      add = a + b;
      System.out.println("�� ������ �� ���� " + add + " �Դϴ�.");

  }
}