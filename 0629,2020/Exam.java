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
            System.out.print( (i+1) + "�� ���Է�.(a,b,c,d �� �ϳ��� �Է��Ͻÿ�)");
            myAnswer[i] = scan.next();
			myAnswer[i] = myAnswer[i].toLowerCase();
            
            if(myAnswer[i].charAt(0) > 'd' || myAnswer[i].charAt(0) < 'a') {
                System.out.println("���� a/b/c/d �� �ϳ��� �Է� �����մϴ�!");
                continue;
            }
            i++;
        } 
        System.out.println();
        System.out.print("���� �Է��� ��::: ");
        for(int i = 0; i < myAnswer.length; i++) {
            System.out.print(myAnswer[i] + " ");
        }
        System.out.println();
        System.out.print("����::: ");
        for (int i = 0; i < answerSheet.length; i++) {
            System.out.print(answerSheet[i] + " ");
        }

        System.out.println();
        System.out.println("���䰳��::: " + correctAnswer(answerSheet, myAnswer));
        System.out.println("���䰳��::: " + incorrectAnswer(answerSheet, myAnswer));

        if(isPassed(correctAnswer(answerSheet, myAnswer))) {
            System.out.println("***��****�հ�!");
        } else {
            System.out.println("���հ�,��Ÿ������!");
        }
    }
    