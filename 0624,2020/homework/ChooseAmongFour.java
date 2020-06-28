import java.util.Scanner;
import java.util.Random;


class ChooseAmongFour {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        //int answerSheet, myInput;
        int answerSheetList[] = new int[10];
        int myInputList[] = new int[10];

        int correct = 0, notCorrect = 0;

        System.out.println("+++정답맞추기 놀이+++");

        //답지
        for (int i = 0; i < answerSheetList.length; i++) {
            answerSheetList[i] = rand.nextInt(4) + 1;
        }
        //답입력
        for (int i = 0; i < myInputList.length; i++) {
            System.out.println((i+1) + "번의 답을 입력하시오.");
            myInputList[i] = sc.nextInt();
            if(myInputList[i] < 1 || myInputList[i] >4) {
                i--;
            }   
        } 
        //입력한 번호출력 
        for (int i = 0; i < myInputList.length; i++){
            System.out.println("나의 입력==>" + (i+1) + "번:" + myInputList[i]);
        }

        //정답 
        for (int i = 0; i < myInputList.length; i++){
            System.out.println("정답==>" + (i+1) + "번:" + answerSheetList[i]);
        }
        
        // 채점
        for (int i = 0; i < myInputList.length; i++) {
            if (answerSheetList[i] == myInputList[i]) {
                correct = correct + 1;
            } else {
                notCorrect = notCorrect + 1;
            }
        }

        //결과출력
        System.out.println(correct + " 개 맞췄다! ^o^!");
        System.out.println(notCorrect + " 개 틀렸다! ㅜ_ㅜ!");
        
        
    }   
}