import java.util.Scanner;

class LabTest01 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int[] lab = new int[10];
      for (int i = 0; i < lab.length; i++) {
          System.out.println("정수를 입력==>");
          lab[i] = scan.nextInt();
      } 
      // each 문 사용해 배열 출력 
      for(int e:lab){
          System.out.print(e + " ");
      }

      // 배열 역순으로 출력 
      for(int i = 9; i >= 0 ; i--){
          System.out.print(lab[i]+ " ");
      }
    }
}