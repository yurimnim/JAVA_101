//�ڹ� ���α׷��� �Ǳ����� �⺻���� 
import java.util.Scanner;

class YourInfo {
   
   public static void main (String[] args) {
		
		String name;
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸�?");
		name = sc.next();
		System.out.println("���?");
		age = sc.nextInt();
			
		System.out.println("�ݰ����ϴ� ȭ����!"); //��ɾ� 
		System.out.println("����� �̸��� " + name);
		System.out.println("����� ���̴� " + age);
  }	
}