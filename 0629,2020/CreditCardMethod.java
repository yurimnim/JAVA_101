import java.util.Scanner;

public class CreditCardMethod {

    public static double total(double []a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    public static double max(double []a) {
        double maxmax = a[0];
        for (int i = 1; i < a.length; i++) {
            if (maxmax < a[i]){
                maxmax = a[i];
            }
        }
        return maxmax;
    }
    
    public static double min(double [] a) {
        double minmin = a[0];
        for (int i = 1; i < a.length; i++){
            if (minmin > a[i]){
                minmin = a[i];
            }
        }
        return minmin;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 

        double[] bills = new double[12];

        for(int i = 0; i < bills.length;) {
            System.out.print( (i+1) + "�� ���ݾ��� �Է��Ͻÿ� ==>");
            bills[i] = scan.nextDouble();

            if(bills[i] < 0) {
                System.out.println("���ݾ��� �ٽ� Ȯ���� �� �Է��Ͻÿ�.");
                continue;
            }
            i++ ;
        }

        System.out.println(); //Linebreak
        System.out.println("���� �� ���ݾ� ==> " + total(bills));
        System.out.println("��� ���ݾ� ==> " + (total(bills)/12));
        System.out.println("�ִ� ���ݾ� ==> " + max(bills) );
        System.out.println("���� ���ݾ� ==>" + min(bills));
        
        for (int i = 0; i < bills.length; i++) {
            if (max(bills) == bills[i]) {
                System.out.println( (i+1) + "���� ���� ���� �ݾ׻��");
            }

            if (min(bills) == bills[i]) {
                System.out.println( (i+1) + "���� ���� ���� �ݾ׻��");
            }
        }
        
    }
    
} 
