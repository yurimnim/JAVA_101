import java.util.Scanner;

class CoffeeOrder {
   public static void main(String[] args){
       int americano;
       int mocha;
       int total;
       
       Scanner sc  = new Scanner(System.in);
       
       System.out.println("아메리카노 몇 개 주문할까요?");	
       americano = sc.nextInt();  
       
       System.out.println("모카 몇 개 주문할까요?");
       mocha = sc.nextInt();
        
       total = americano + mocha;

       System.out.println("아메리카노 " +  americano + " 잔" + "모카 " + mocha + " 잔 총 " + total + " 잔 주문할게요!");
       
  }
}