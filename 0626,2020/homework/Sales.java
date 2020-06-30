import java.util.Scanner;

//분기별 부서별 매출액 
//분기별 회사 전체 매출액 
//분기별 회사 전체 평균매출액 
//특정분기에 최고 매출액 올린 부서 출력

//아직 하는중 완성 안됨 

class Sales {

    public static void getCompleteTable(int[][] arry) {
        for(int i = 0; i < arry.length; i++) {
            System.out.print( (i+1) + " 사분기 ");
            for (int j = 0; j < arry[i].length; j++) {
                System.out.println( (j+1) + " 팀 매출액" + arry[i][j] + " 원");
            }
        }

    }
    
    public static int getSumPerTeam(int[][] arry, int colNum) {
        int sumOfColumn = 0;

        for (int i = 0; i < arry.length; i++){
            sumOfColumn += arry[i][colNum];
        }     
        return sumOfColumn;
    }
    
    public static int getSumPerFiscal(int[][] arry, int rowNum) {
        int sumOfRows = 0;

        for (int i = 0; i < arry[rowNum].length; i++){
            sumOfRows += arry[rowNum][i];
        }    
        return sumOfRows;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[4][5];
        
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length;){
                System.out.print( (i+1) + "사분기" + " 세일즈" + (j+1) + "팀의 총 매출액을 입력하시오.");
                arr[i][j] = scan.nextInt();
                if(arr[i][j] < 0) {
                    System.out.println("매출액으로 음수를 입력할 수 없습니다.");
                    continue;
                    }
                    j++;
                }
              }

        getCompleteTable(arr);      

              /*ArrayTest
              for (int i = 0; i < arr.length; ++i) {
                  for (int j = 0; j < arr[i].length; ++j) {
                      System.out.println(arr[i][j]);
                  }
              } */
              //분기별 총 금액 

     } //main 
        
    }//class 
    
