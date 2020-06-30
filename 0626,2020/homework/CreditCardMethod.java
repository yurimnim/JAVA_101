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
            System.out.print( (i+1) + "월 사용금액을 입력하시오 ==>");
            bills[i] = scan.nextDouble();

            if(bills[i] < 0) {
                System.out.println("사용금액을 다시 확인한 뒤 입력하시오.");
                continue;
            }
            i++ ;
        }

        System.out.println(); //Linebreak
        System.out.println("연간 총 사용금액 ==> " + total(bills));
        System.out.println("평균 사용금액 ==> " + (total(bills)/12));
        System.out.println("최대 사용금액 ==> " + max(bills) );
        System.out.println("최저 사용금액 ==>" + min(bills));
        
        for (int i = 0; i < bills.length; i++) {
            if (max(bills) == bills[i]) {
                System.out.println( (i+1) + "월에 가장 높은 금액사용");
            }

            if (min(bills) == bills[i]) {
                System.out.println( (i+1) + "월에 가장 낮은 금액사용");
            }
        }
        
    }
    
} 