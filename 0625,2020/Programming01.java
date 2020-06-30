import java.util.Scanner;

class Programming01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double[] monthlyBills = new double[12];

        System.out.println("***** 신용카드 지출 계산기 *****");
        //입력받기  
        for (int i = 0; i < monthlyBills.length; i++){
            System.out.print((i + 1) + "월 신용카드 사용금액 입력 ==>");
            monthlyBills[i] = sc.nextDouble();

            if(monthlyBills[i] < 0){
                System.out.println("금액을 다시 입력하십시오.");
                i--;
            }
        }
        
        // 합계 최대 최소 평균 도출
        double min = monthlyBills[0];
        double max = monthlyBills[0];
        double sum = 0;
        int idmax = 0, idmin = 0;

        for (int i = 0; i < monthlyBills.length; i++){
        System.out.println((i + 1) + "월 사용금액 ==>" + monthlyBills[i]);
        sum = sum + monthlyBills[i];

        if(monthlyBills[i] > max) {
            max = monthlyBills[i];
            idmax = i;  
        }
        if(monthlyBills[i] < min) {
            min = monthlyBills[i];
            idmin = i;
        }  
    }
    System.out.println("총 신용카드 사용금액:::" + sum);
    System.out.println("월 평균 사용금액:::" + sum/12);
    System.out.println("가장 많이 지출한 달:::" + (idmax+ 1) + " 월, " + max + " 사용");
    System.out.println("가장 적게 지출한 달:::" + (idmin+ 1) + " 월, " + min + " 사용");


 }
}