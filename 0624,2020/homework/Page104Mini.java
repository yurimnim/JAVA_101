
import java.util.Random;

class  Page104Mini {
	public static void main(String[] args) {
		Random rand = new Random();
        int selectA, selectB;
        String selectC, selectD;

		String[] shape = {"Clubs","Diamonds", "Hearts", "Spades" };
		String[] number = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "Queen", "King", "Ace"};

        for(int i = 1; i <= 5; i++) {
            selectA = rand.nextInt(shape.length - 1);
            selectB = rand.nextInt(number.length - 1);

            selectC = shape[selectA];
            selectD = number[selectB];
                           
          System.out.println(selectC + "의 " + selectD);  
        }
        
    }
        
}

