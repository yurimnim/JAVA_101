import java.util.Scanner;

class FreeTest { 
   public static void main(String[] args) {
      String name;
      int age;

      Scanner sc  = new Scanner(System.in);

      System.out.println("�̸��� �Է��Ͻʽÿ�.");
      name = sc.next();

      System.out.println("���̸� �Է��Ͻʽÿ�.");
      age =  sc.nextInt();  

     if (age >= 40) 
        System.out.println(name + " ���� ���� �ϰ��� ����� �Դϴ�.");
     else
       System.out.println(name + " ���� ���� �ϰ��� ����ڰ� �ƴմϴ�.");   
  }
}