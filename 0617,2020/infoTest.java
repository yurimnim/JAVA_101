//자바 프로그램이 되기위한 기본구조 
import java.util.Scanner;

class YourInfo {
   
   public static void main (String[] args) {
		
		String name;
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름?");
		name = sc.next();
		System.out.println("몇살?");
		age = sc.nextInt();
			
		System.out.println("반갑습니다 화이팅!"); //명령어 
		System.out.println("당신의 이름은 " + name);
		System.out.println("당신의 나이는 " + age);
  }	
}