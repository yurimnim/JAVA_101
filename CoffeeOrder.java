import java.util.Scanner;

class CoffeeOrder {
   public static void main(String[] args){
       int americano;
       int mocha;
       int total;
       
       Scanner sc  = new Scanner(System.in);
       
       System.out.println("�Ƹ޸�ī�� �� �� �ֹ��ұ��?");	
       americano = sc.nextInt();  
       
       System.out.println("��ī �� �� �ֹ��ұ��?");
       mocha = sc.nextInt();
        
       total = americano + mocha;

       System.out.println("�Ƹ޸�ī�� " +  americano + " ��" + "��ī " + mocha + " �� �� " + total + " �� �ֹ��ҰԿ�!");
       
  }
}