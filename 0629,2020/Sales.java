//�б⺰ �μ��� ����� 
//�б⺰ ȸ�� ��ü ����� 
//�б⺰ ȸ�� ��ü ��ո���� 
//Ư���б⿡ �ְ� ����� �ø� �μ� ���

//���� �ϴ��� �ϼ� �ȵ� 

class Sales {
    
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
                System.out.print( (i+1) + "��б�" + " ������" + (j+1) + "���� �� ������� �Է��Ͻÿ�.");
                arr[i][j] = scan.nextInt();
                if(arr[i][j] < 0) {
                    System.out.println("��������� ������ �Է��� �� �����ϴ�.");
                    continue;
                    }
                    j++;
                }
              }

              /*ArrayTest
              for (int i = 0; i < arr.length; ++i) {
                  for (int j = 0; j < arr[i].length; ++j) {
                      System.out.println(arr[i][j]);
                  }
              } */
              //�б⺰ �� �ݾ� 
              for (int i = 0; i < arr.length; i++) {
                System.out.println( (i + 1) + "��б� �� �Ѹ��� ::" + getSumPerFiscal(arr,i));
              } 

              for (int i = 0; i < arr[i].length; i++) {
                  System.out.println((i + 1) + "�� �� �� ���� ::" + getSumPerTeam(arr, i));
              }


     } //main 
        
    }//class 