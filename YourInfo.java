import java.util.Scanner; 

class YourInfo{
   public static void main(String[] args){
     String name;
     int age;
 
    Scanner sc  = new Scanner(System.in);
 
    System.out.println("����� �̸��� �����ΰ���?");
    name = sc.next();      

    System.out.println("���̴� ����ΰ���?");
    age = sc.nextInt();      

    System.out.println(name + "�� �ݰ����ϴ�.");
    System.out.println(age + "�� �̱���!");

 }
}
