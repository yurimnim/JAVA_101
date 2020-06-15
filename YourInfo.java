import java.util.Scanner; 

class YourInfo{
   public static void main(String[] args){
     String name;
     int age;
 
    Scanner sc  = new Scanner(System.in);
 
    System.out.println("당신의 이름은 무엇인가요?");
    name = sc.next();      

    System.out.println("나이는 몇살인가요?");
    age = sc.nextInt();      

    System.out.println(name + "님 반갑습니다.");
    System.out.println(age + "살 이군요!");

 }
}
