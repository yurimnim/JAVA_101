import java.util.Scanner;

class Programming03_276 {

    public static int getMax(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
           if(a[i] > max) {
               max = a[i];
           }
        }
        return max;
    }

    public static int getMin(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static int getAverage(int[] a) {
        int average = 0;
        for (int i = 0; i < a.length; i++) {
            average = a[i] + average;
        }
        return average/a.length;
    }

    public static int getTotal(int[] a) {
        int total = 0;
        for(int i = 0; i < a.length; i++) {
            total = a[i] + total;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        
        //TEST
        for(int i = 0; i < arr.length; i++) {
            System.out.println((i+1) + "번쨰 정수를 입력하시오");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("MAX::: " + getMax(arr));
        System.out.println("MIN::: " + getMin(arr));
        System.out.println("TOTAL::: " + getTotal(arr));
        System.out.println("AVERAGE::: " + getAverage(arr));
    }
    
}

