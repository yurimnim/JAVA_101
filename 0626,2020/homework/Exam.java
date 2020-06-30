import java.util.Scanner;

public class Exam {
   
    public static int correctAnswer(String[] a, String[] b) {
        int correct = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i].charAt(0) == b[i].charAt(0)) {
                correct++;
            }
        }
        return correct; 
    }

    public static int incorrectAnswer(String[] c, String[] d) {
        int incorrect = 0;
        for(int i = 0; i < c.length; i++) {
            if(c[i].charAt(0) != d[i].charAt(0)) {
            incorrect++;
          }  
        }
        return incorrect;
    }

    public static boolean isPassed(int x) {
        boolean result = false; 
        if(x >= 7) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String[] answerSheet = {"a", "b", "c", "d", "d", "a", "b", "d", "d", "a"};
        String[] myAnswer = new String[10];
        
        for(int i = 0; i < myAnswer.length;) {
            System.out.print( (i+1) + "번 답입력.(a,b,c,d 중 하나만 입력하시오)");
            myAnswer[i] = scan.next();
            
            if(myAnswer[i].charAt(0) > 'd' || myAnswer[i].charAt(0) < 'a') {
                System.out.println("답은 a/b/c/d 중 하나만 입력 가능합니다!");
                continue;
            }
            i++;
        } 
        System.out.println();
        System.out.print("내가 입력한 답::: ");
        for(int i = 0; i < myAnswer.length; i++) {
            System.out.print(myAnswer[i] + " ");
        }
        System.out.println();
        System.out.print("정답::: ");
        for (int i = 0; i < answerSheet.length; i++) {
            System.out.print(answerSheet[i] + " ");
        }

        System.out.println();
        System.out.println("정답개수::: " + correctAnswer(answerSheet, myAnswer));
        System.out.println("오답개수::: " + incorrectAnswer(answerSheet, myAnswer));

        if(isPassed(correctAnswer(answerSheet, myAnswer))) {
            System.out.println("***축****합격!");
        } else {
            System.out.println("불합격,안타깝군요!");
        }
    }
    
}