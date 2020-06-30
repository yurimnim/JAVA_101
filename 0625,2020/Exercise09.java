class Exercise09 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {6,7,8,9,10};
        
        /*
        if (a == b){
            System.out.println("일치합니다");
        }else {
            System.out.println("일치하지 않습니다");
        }
        */

        boolean same = false;
        for(int i = 0; i < 5; i++){
            if (a[i] == b[i]) 
             same = true;
        }

        if (same) {
            System.out.println("일치합니다");
        } else {
            System.out.println("일치하지 않습니다");
        }

    } 
}