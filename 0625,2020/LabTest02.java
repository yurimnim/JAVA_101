import java.util.Scanner;

class LabTest02 {    
    public static void main(String[] args) {
        int[] count = new int[26];

        Scanner scan = new Scanner(System.in);

        System.out.println("문자열을 입력하시오.");
        String n = scan.next();
        n = n.toLowerCase();

        for(int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if(ch != ' ') {
               count[ch - 'a']++;
            }       
        }
        
        for(int i = 0; i < count.length; i++){
            System.out.println( (char)('a' + i) + "==>" + count[i] );
        } 
    }    
}