class Page110Ten{
    public static void main(String[] args) {
        double[] group = {1.0, 2.0, 3,0, 4.0};
        double sum = 0;
        double max = 0;

        for (int i = 0; i < group.length; i++) {
            System.out.print(group[i] + " ");
            
            sum = sum + group[i];
            
            max = group[0];
            if (group[i] > max) {
                max = group[i];
            }   
        }
        System.out.println(" ");
        System.out.println("최대값은 " + max);
        System.out.println("합은 " + sum);
        

    }
}